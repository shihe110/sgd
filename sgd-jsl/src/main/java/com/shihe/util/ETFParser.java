package com.shihe.util;

import com.alibaba.fastjson.JSON;
import com.shihe.pojo.Cell;
import com.shihe.pojo.JsonRootBean;
import com.shihe.pojo.Rows;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName ETFParser
 * @Description TODO
 * @Author admin
 * @Date 2021-02-04 15:21
 * @Version 1.0
 */
@Component
public class ETFParser {

    public static OkHttpClient client = new OkHttpClient();

    /*public static void main(String[] args) throws IOException {
        String url = "https://www.jisilu.cn/data/etf/etf_list/";
        String jsonstr = new ETFParser().run(url);
        JsonRootBean data = JSON.parseObject(jsonstr, JsonRootBean.class);
        List<Rows> rows = data.getRows();
        for (Rows row : rows) {
            Cell cell = row.getCell();
            System.out.println(cell.toString());
        }
    }*/


    /**
     * okhttp get调用
     * 返回json string
     */
    public String getCall(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    /**
     * okhttp接口调用
     * json string to java bean
     */
    public Object parseJsonToJavaBean(String jsonstr, Class clazz) throws IOException {
        Object javabean = JSON.parseObject(jsonstr, clazz);
        return javabean;
    }

}
