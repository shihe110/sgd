package com.shihe.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shihe.pojo.SgdStock;
import com.shihe.pojo.SgdStockOf;
import com.shihe.mapper.SgdStockOfMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shihe.pojo.dto.StockPEG;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shihe
 * @since 2021-02-19
 */
@Service
public class SgdStockOfServiceImpl extends ServiceImpl<SgdStockOfMapper, SgdStockOf> implements ISgdStockOfService {

    @Override
    public StockPEG getPeg(SgdStockOf stockOf) throws IOException {
        String url = "https://www.jisilu.cn/data/stock/" + stockOf.getsCode();
        Document doc = Jsoup.parse(new URL(url), 30000);
        Elements elementsByTag = doc.getElementById("stock_detail").getElementsByTag("tbody");
        Elements tr = elementsByTag.select("tr").last().children();
        // 5年增长率
        String rt = tr.get(3).children().text();
        rt = rt.substring(0, rt.length() - 1);
        String flag = "0";
        String jlr = tr.get(4).children().text();
        jlr = jlr.substring(0, jlr.length() - 1);
        if (!isNumeric(rt)){
            rt = jlr;
            flag = "1";
        }

        Elements item_sub = doc.getElementsByClass("item_row");
        Elements children = item_sub.get(0).children();
        Element element = children.get(0).children().get(0);
        Elements div = element.getElementsByTag("div");
        // 当前pe
        String pe = div.get(2).select("span").text();
        String text = div.get(5).text();
        // 平均pe
        String avg = text.substring(4, text.length() - 1).trim();
        // peg pe/(rt*100)
        double peg = Double.valueOf(pe) / Double.valueOf(rt);
        double avgPeg = Double.valueOf(avg) / Double.valueOf(rt);

        StockPEG stockPEG = new StockPEG();
        stockPEG.setCode(stockOf.getsCode());
        stockPEG.setName(stockOf.getsName());
        stockPEG.setPeg(String.format("%.2f",peg));
        stockPEG.setAvgPeg(String.format("%.2f",avgPeg));
        if (flag.equals("1")){
            stockPEG.setPeg("净利润："+String.format("%.2f",peg));
            stockPEG.setAvgPeg("净利润："+String.format("%.2f",avgPeg));
        }
        return stockPEG;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
