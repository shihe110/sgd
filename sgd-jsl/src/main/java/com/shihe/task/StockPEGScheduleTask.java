package com.shihe.task;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shihe.pojo.SgdStockHistory;
import com.shihe.pojo.SgdStockOf;
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
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StockPEGScheduleTask
 * @Description TODO
 * @Author admin
 * @Date 2021-02-24 8:55
 * @Version 1.0
 */
@Component
public class StockPEGScheduleTask {

    @Autowired
    private ISgdStockOfService iSgdStockOfService;
    @Autowired
    private ISgdStockHistoryService iSgdStockHistoryService;

    @Scheduled(cron = "0 29 15 ? * MON-FRI")
    private void configureJslTasks() throws IOException {
        QueryWrapper<SgdStockOf> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",2);
        List<SgdStockOf> list = iSgdStockOfService.list(wrapper);
        for (SgdStockOf stockOf : list) {


            String code = stockOf.getsCode();
            String peg = getPEG(code);
        }
    }


    /**
     * 每日自选股票历史数据-定时器
     *
     * @throws IOException
     */
    @Scheduled(cron = "0 29 15 ? * MON-FRI")
    private void configureTasks() throws IOException {
        QueryWrapper<SgdStockOf> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",2);
//        wrapper.ne("s_market","-");
        List<SgdStockOf> list = iSgdStockOfService.list(wrapper);
        for (SgdStockOf stockOf : list) {
            String code = stockOf.getsCode();
            String peg = getPEG(code);
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
    public String getJsl(String code) throws IOException {
        String url = "https://www.jisilu.cn/data/stock/" + code;
        Document doc = Jsoup.parse(new URL(url), 30000);
        Elements elementsByTag = doc.getElementById("stock_detail").getElementsByTag("tbody");
        Elements tr = elementsByTag.select("tr").last().children();
        // 5年增长率
        String rt = tr.get(3).children().text();
        rt = rt.substring(0, rt.length() - 1);

        Elements item_sub = doc.getElementsByClass("item_row");
        Elements children = item_sub.get(0).children();
        Element element = children.get(0).children().get(0);
        Elements div = element.getElementsByTag("div");
        // 当前pe
        String pe = div.get(2).select("span").text();
        System.out.println(pe);
        String text = div.get(5).text();
        // 平均pe
        String avg = text.substring(4, text.length() - 1).trim();
        // peg pe/(rt*100)
        double peg = Double.valueOf(pe) / Double.valueOf(rt);
        return String.valueOf(peg);
    }

    public String getPEG(String code) throws IOException {
        String url = "https://www.jisilu.cn/data/stock/" + code;
        Document doc = Jsoup.parse(new URL(url), 30000);
        Elements elementsByTag = doc.getElementById("stock_detail").getElementsByTag("tbody");
        Elements tr = elementsByTag.select("tr").last().children();
        // 5年增长率
        String rt = tr.get(3).children().text();
        rt = rt.substring(0, rt.length() - 1);

        Elements item_sub = doc.getElementsByClass("item_row");
        Elements children = item_sub.get(0).children();
        Element element = children.get(0).children().get(0);
        Elements div = element.getElementsByTag("div");
        // 当前pe
        String pe = div.get(2).select("span").text();
        System.out.println(pe);
        String text = div.get(5).text();
        // 平均pe
        String avg = text.substring(4, text.length() - 1).trim();
        // peg pe/(rt*100)
        double peg = Double.valueOf(pe) / Double.valueOf(rt);
        return String.valueOf(peg);
    }

    public static void main(String[] args) throws IOException {
        String url = "https://www.jisilu.cn/data/stock/000001";
        Document doc = Jsoup.parse(new URL(url), 30000);
        Elements elementsByTag = doc.getElementById("stock_detail").getElementsByTag("tbody");
        Elements tr = elementsByTag.select("tr");
        Elements td1 = tr.get(0).getElementsByTag("td");
        String t0 = td1.get(0).text();
        // 现价 涨幅  市值  总股本
        String price = td1.get(1).text().substring(2).trim();
        String incremental = td1.get(2).text().substring(2).trim().substring(0,td1.get(2).text().substring(2).trim().length()-1);
        String marketVal = td1.get(3).text().substring(2).trim().substring(0,td1.get(3).text().substring(2).trim().length()-1);
        String totalStock = td1.get(4).text().substring(3).trim().substring(0,td1.get(4).text().substring(3).trim().length()-2);

        Elements td2 = tr.get(1).getElementsByTag("td");
        // 股息率
        String stockRt = td2.get(1).text().substring(6).trim().substring(0,td2.get(1).text().substring(6).trim().length()-1);
        // 波动率
        String bodong = td2.get(2).text().substring(3).trim();
        // 有息负债率
        String yxfzRt = td2.get(3).text().substring(5).trim().substring(0,td2.get(3).text().substring(5).trim().length()-1);
        // 股票质押比例
        String zhiya = td2.get(4).text().substring(6).trim();

        Elements td3 = tr.get(2).getElementsByTag("td");
        // 5年平均roe 	5年营收增长率 2.75%	5年利润增长率 7.51%	净利同比增长 -55.38%
        String fiveroe = td3.get(1).text().substring(7).trim().substring(0,td3.get(1).text().substring(7).trim().length()-1);
        String fiveIncre = td3.get(2).text().substring(7).trim().substring(0,td3.get(2).text().substring(7).trim().length()-1);
        String fiveLrzz = td3.get(3).text().substring(7).trim().substring(0,td3.get(3).text().substring(7).trim().length()-1);
        String fiveLrl = td3.get(4).text().substring(6).trim().substring(0,td3.get(4).text().substring(6).trim().length()-1);


        System.out.println(elementsByTag.html());
//        System.out.println(elementsByTag.html());
        Elements trx = elementsByTag.select("tr").last().children();

        // 5年增长率
        String rt = trx.get(3).children().text();
        rt = rt.substring(0, rt.length() - 1);


        Elements item_sub = doc.getElementsByClass("item_row");
        Elements children = item_sub.get(0).children();
        Element element = children.get(0).children().get(0);
        Elements div = element.getElementsByTag("div");
        // 当前pe
        String pe = div.get(2).select("span").text();
        System.out.println(pe);

        String text = div.get(5).text();
        // 平均pe
        String avg = text.substring(4, text.length() - 1).trim();

        // peg pe/(rt*100)
        double peg = Double.valueOf(pe) / Double.valueOf(rt);
        System.out.println(peg);
    }


}
