package com.shihe.task;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shihe.pojo.*;
import com.shihe.service.ISgdStockOfService;
import com.shihe.service.ISgdStockOfdataService;
import com.shihe.util.InterfaceParserUtil;
import com.shihe.util.MarketCode;
import com.shihe.util.UniqueIdUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ETFScheduleTask
 * @Description TODO 自选每日数据定时任务
 * @Author shihe
 * @Date 2021-02-07 14:10
 * @Version 1.0
 */
@Component
public class StockOfScheduleTask {

    @Autowired
    private InterfaceParserUtil interfaceParserUtil;

    @Autowired
    private ISgdStockOfService iSgdStockOfService;

    @Autowired
    private ISgdStockOfdataService iSgdStockOfdataService;

    /**
     * 每日自选股票数据-定时器
     *
     * @throws IOException
     */
    @Scheduled(cron = "0 30 15 ? * MON-FRI")
    private void configureTasks() throws IOException, ParseException {
        String stockOfMineStr = getStockOfMineStr();
        String url = "http://hq.sinajs.cn/list=" + stockOfMineStr;
        String callStr = interfaceParserUtil.getCall(url);
        List<SgdStockOfdata> ofdatas = sinaToBean(callStr);
        iSgdStockOfdataService.saveBatch(ofdatas);
    }

    /**
     * sina接口结果转Javabean
     * @param callStr
     * @return
     * @throws ParseException
     */
    private List<SgdStockOfdata> sinaToBean(String callStr) throws ParseException {
        ArrayList<SgdStockOfdata> ofdata = new ArrayList<>();
        String[] stocks = callStr.split("\n");
        for (String stock : stocks) {
            SgdStockOfdata sk = new SgdStockOfdata();
            sk.setId(UniqueIdUtil.genDateId());

            String[] s = stock.split("=");
            if (!s[1].equals("\"\";")){
                String scode = s[0].substring(s[0].length() - 6);
                sk.setsCode(scode);

                String[] datas = s[1].split(",");
                sk.setsName(datas[0].substring(1));
                sk.setPriceJk(datas[1]);
                sk.setPriceZs(datas[2]);
                sk.setPrice(datas[3]);
                sk.setPriceTop(datas[4]);
                sk.setPriceLow(datas[5]);
                sk.setDealSnum(datas[8]);
                sk.setDealMoney(datas[9]);
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date = LocalDate.parse(datas[30], fmt);
                sk.setsDate(date);
                Double dq = Double.valueOf(datas[3]);
                Double zs = Double.valueOf(datas[2]);
                Double rise = (double) Math.round(((dq-zs)/ zs) * 10000) / 10000;
                sk.setPriceRise(rise);

                ofdata.add(sk);
            }
        }
        return ofdata;
    }

    /**
     * 获取自选code str
     * @return
     */
    private String getStockOfMineStr () {
        QueryWrapper<SgdStockOf> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", "1");
        List<SgdStockOf> list = iSgdStockOfService.list(wrapper);
        return listToStr(list);
    }

    /**
     * str转换及市场判断
     * @param list
     * @return
     */
    private String listToStr(List<SgdStockOf> list) {
        String codeStr = "";
        for (SgdStockOf sgdStockOf : list) {
            String code = sgdStockOf.getsCode();
            String market = sgdStockOf.getsMarket().trim();
            if (StringUtils.lowerCase(market).equals(MarketCode.MARKET_SH)){
                codeStr += MarketCode.MARKET_SH + code + ",";
            }else if (StringUtils.lowerCase(market).equals(MarketCode.MARKET_SZ)){
                codeStr += MarketCode.MARKET_SZ + code + ",";
            }else {
                codeStr += MarketCode.MARKET_SH + code + "," + MarketCode.MARKET_SZ + code + ",";
            }
        }
        return codeStr;
    }


    public static void main(String[] args) throws IOException {
        StockOfScheduleTask stockOfScheduleTask = new StockOfScheduleTask();
        String url = "http://hq.sinajs.cn/list=" + "sz300124,sh512170,";
        InterfaceParserUtil interfaceParserUtil = new InterfaceParserUtil();
        String callStr = interfaceParserUtil.getCall(url);
        String[] split = callStr.split("\n");
        System.out.println(callStr);
    }
}