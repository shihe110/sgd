package com.shihe.util;

import com.alibaba.fastjson.JSON;
import com.shihe.pojo.Cell;
import com.shihe.pojo.JsonRootBean;
import com.shihe.pojo.Rows;
import com.shihe.pojo.SgdFundEtf;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
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
    
    public List<SgdFundEtf> beanToSgdFundEtf(JsonRootBean sources){
        ArrayList<SgdFundEtf> targetList = new ArrayList<>();
        List<Rows> rows = sources.getRows();
        for (Rows row : rows) {
            Cell cell = row.getCell();
            SgdFundEtf sgdFundEtf = new SgdFundEtf();
            sgdFundEtf.setFundId(cell.getFund_id());
            sgdFundEtf.setFundNm(cell.getFund_nm());
            sgdFundEtf.setIndexId(cell.getIndex_id());
            sgdFundEtf.setFee(cell.getFee());
            sgdFundEtf.setmFee(cell.getM_fee());
            sgdFundEtf.settFee(cell.getT_fee());
            sgdFundEtf.setCreationUnit(cell.getCreation_unit());
            sgdFundEtf.setIssuerNm(cell.getIssuer_nm());
            sgdFundEtf.setUrls(cell.getUrls());
            sgdFundEtf.setEvalFlg(cell.getEval_flg());
            sgdFundEtf.setAmount(cell.getAmount());
            sgdFundEtf.setUnitTotal(cell.getUnit_total());
            sgdFundEtf.setUnitIncr(cell.getUnit_incr());
            sgdFundEtf.setPrice(cell.getPrice());
            sgdFundEtf.setVolume(cell.getVolume());
            sgdFundEtf.setLastDt(cell.getLast_dt());
            sgdFundEtf.setLastTime(cell.getLast_time());
            sgdFundEtf.setIncreaseRt(cell.getIncrease_rt());
            sgdFundEtf.setEstimateValue(cell.getEstimate_value());
            sgdFundEtf.setLastEstTime(cell.getLast_est_time());
            sgdFundEtf.setDiscountRt(cell.getDiscount_rt());
            sgdFundEtf.setFundNav(cell.getFund_nav());
            sgdFundEtf.setNavDt(cell.getNav_dt());
            sgdFundEtf.setIndexNm(cell.getIndex_nm());
            sgdFundEtf.setIncreaseRt(cell.getIndex_increase_rt());
            sgdFundEtf.setPe(cell.getPe());
            sgdFundEtf.setPb(cell.getPb());
            sgdFundEtf.setIdxPriceDt(cell.getIdx_price_dt());
            sgdFundEtf.setOwned(cell.getOwned());
            sgdFundEtf.setHolded(cell.getHolded());
            // id的处理
            sgdFundEtf.setId(UniqueIdUtil.genId());

            targetList.add(sgdFundEtf);
        }
        return targetList;
    }

}
