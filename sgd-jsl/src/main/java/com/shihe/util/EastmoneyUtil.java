package com.shihe.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName EastmoneyUtil
 * @Description TODO
 * @Author admin
 * @Date 2021-02-08 16:43
 * @Version 1.0
 */
public class EastmoneyUtil {

    public static void main(String[] args) throws IOException {
        String url = "http://quote.eastmoney.com/center/gridlist.html#hs_a_board";
        Document doc = Jsoup.parse(new URL(url), 30000);
        System.out.println(doc.html());
        Element element = doc.getElementById("table_wrapper-table");
        Elements elements = element.getElementsByTag("tr");
        for (Element el : elements) {
            System.out.println(el.html());
        }
        /*String url = "https://www.jisilu.cn/data/stock/300326";
        Document doc = Jsoup.parse(new URL(url), 30000);
        System.out.println(doc.html());
        Element element = doc.getElementById("stock_detail");
        Elements elements = element.getElementsByTag("td");
        for (Element el : elements) {
            System.out.println(el.html());
        }*/
    }
}
