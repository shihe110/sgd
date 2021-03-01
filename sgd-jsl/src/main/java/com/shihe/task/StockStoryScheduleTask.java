package com.shihe.task;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shihe.pojo.SgdStock;
import com.shihe.pojo.SgdStockHistory;
import com.shihe.pojo.SgdStockOf;
import com.shihe.pojo.SgdStockOfdata;
import com.shihe.service.ISgdStockHistoryService;
import com.shihe.service.ISgdStockOfService;
import com.shihe.util.UniqueIdUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StockStoryScheduleTask
 * @Description TODO
 * @Author admin
 * @Date 2021-02-24 8:55
 * @Version 1.0
 */
@Component
public class StockStoryScheduleTask {

    @Autowired
    private ISgdStockOfService iSgdStockOfService;
    @Autowired
    private ISgdStockHistoryService iSgdStockHistoryService;

    /**
     * 每日自选股票历史数据-定时器
     *
     * @throws IOException
     */
    @Scheduled(cron = "0 29 15 ? * MON-FRI")
    private void configureTasks() throws IOException {
        QueryWrapper<SgdStockOf> wrapper = new QueryWrapper<>();
        wrapper.ne("s_market","-");
        List<SgdStockOf> list = iSgdStockOfService.list(wrapper);
        for (SgdStockOf stockOf : list) {
            String url = "http://www.aigaogao.com/tools/history.html?s="+stockOf.getsCode();
            Document doc = Jsoup.parse(new URL(url), 30000);
            Elements elementsByTag = doc.getElementById("ctl16_contentdiv").getElementsByTag("tr");
            ArrayList<SgdStockHistory> his = new ArrayList<>();
            for (int i = 1; i < elementsByTag.size(); i++) {
                Element element = elementsByTag.get(i);
                Elements children = element.children();
                SgdStockHistory stock = elementToBean(children, stockOf);
                if (stock != null){
                    his.add(stock);
                }
            }
            iSgdStockHistoryService.saveBatch(his);
        }
    }

    private SgdStockHistory elementToBean(Elements children, SgdStockOf stockOf) {
        String date = children.get(0).text();
        if (date.equals("-- End --")){
            return null;
        }
        SgdStockHistory stockHistory = new SgdStockHistory();
        stockHistory.setId(UniqueIdUtil.genDateId());
        stockHistory.setsCode(stockOf.getsCode());
        LocalDate sDate = LocalDate.parse(children.get(0).text(), DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        stockHistory.setsDate(sDate);
        stockHistory.setPriceOpen(Double.valueOf(children.get(1).text().replaceAll(",","")));
        stockHistory.setPriceTop(Double.valueOf(children.get(2).text().replaceAll(",","")));
        stockHistory.setPriceLow(Double.valueOf(children.get(3).text().replaceAll(",","")));
        stockHistory.setPriceClose(Double.valueOf(children.get(4).text().replaceAll(",","")));
        stockHistory.setDealAmount(children.get(5).text().replaceAll(",",""));
        stockHistory.setDealNum(children.get(6).text().replaceAll(",",""));
        stockHistory.setIncre(children.get(7).text());
        stockHistory.setIncreRt(children.get(8).text().replaceAll("%","").trim());
        String suo = children.get(9).text();
        if (suo.equals("")||suo == null){
            stockHistory.setSuo("0");
        }else {
            stockHistory.setSuo(suo);
        }
        stockHistory.setHiLow(children.get(10).text().replaceAll("%","").trim());
        stockHistory.setMarketIndex(children.get(11).text());
        stockHistory.setMarketIncr(children.get(12).text());
        stockHistory.setUserId(stockOf.getUserId());

        return stockHistory;
    }

    public static void main(String[] args) throws IOException {
        String url = "http://www.aigaogao.com/tools/history.html?s=600276";
        Document doc = Jsoup.parse(new URL(url), 30000);
        Elements elementsByTag = doc.getElementById("ctl16_contentdiv").getElementsByTag("tr");
        for (int i = 1; i < elementsByTag.size(); i++) {
            Element element = elementsByTag.get(i);
            Elements children = element.children();
            String text1 = children.get(0).text();
            System.out.println(text1);
            for (Element child : children) {
                String text = child.text();
                if (text == null || text.equals("")){
                    text = "0";
                }
                System.out.println(text);
            }
        }
    }
}
