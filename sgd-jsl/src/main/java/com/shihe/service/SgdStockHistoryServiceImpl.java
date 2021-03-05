package com.shihe.service;

import com.shihe.pojo.SgdStockHistory;
import com.shihe.mapper.SgdStockHistoryMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shihe.pojo.SgdStockOf;
import com.shihe.util.UniqueIdUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shihe
 * @since 2021-02-24
 */
@Service
public class SgdStockHistoryServiceImpl extends ServiceImpl<SgdStockHistoryMapper, SgdStockHistory> implements ISgdStockHistoryService {

    @Override
    public String getResult(List<String> stocks) throws IOException {
        Map<String, List<SgdStockHistory>> maps = new HashMap<>();
        for (String code : stocks) {
            String url = "http://www.aigaogao.com/tools/history.html?s="+code;
            Document doc = Jsoup.parse(new URL(url), 30000);
            Elements elementsByTag = doc.getElementById("ctl16_contentdiv").getElementsByTag("tr");
            ArrayList<SgdStockHistory> his = new ArrayList<>();
            for (int i = 1; i < elementsByTag.size(); i++) {
                Element element = elementsByTag.get(i);
                Elements children = element.children();
                SgdStockHistory stock = elementToBean(children, code);
                if (stock != null){
                    his.add(stock);
                }
            }
            maps.put(code, his);
        }
        String res = compute(maps);
        return res;
    }

    private String compute(Map<String, List<SgdStockHistory>> maps) {
        double res = 0d;
        Set<String> keys = maps.keySet();
        for (String key : keys) {
            List<SgdStockHistory> list = maps.get(key);
            List<SgdStockHistory> collect = list.stream().sorted(Comparator.comparing(SgdStockHistory::getsDate)).collect(Collectors.toList());
            SgdStockHistory stockHistory = collect.get(0);
            SgdStockHistory stockHistory1 = collect.get(collect.size()-1);
            Double priceClose = stockHistory.getPriceClose();
            Double priceClose1 = stockHistory1.getPriceClose();
            res += (priceClose1 - priceClose);
        }
        return res+"";
    }

    private SgdStockHistory elementToBean(Elements children, String code) {
        String date = children.get(0).text();
        if (date.equals("-- End --")){
            return null;
        }
        SgdStockHistory stockHistory = new SgdStockHistory();
        stockHistory.setId(UniqueIdUtil.genDateId());
        stockHistory.setsCode(code);
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
//        stockHistory.setUserId(stockOf.getUserId());

        return stockHistory;
    }
}
