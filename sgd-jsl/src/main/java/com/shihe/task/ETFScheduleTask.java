package com.shihe.task;

import com.shihe.pojo.JsonRootBean;
import com.shihe.pojo.SgdFundEtf;
import com.shihe.service.ISgdFundEtfService;
import com.shihe.util.ETFParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName ETFScheduleTask
 * @Description TODO
 * @Author shihe
 * @Date 2021-02-07 14:10
 * @Version 1.0
 */
@Component
public class ETFScheduleTask {

    @Autowired
    private ETFParser etfParser;

    @Autowired
    private ISgdFundEtfService iSgdFundEtfService;

    /**
     * 每日etf数据-定时器
     * @throws IOException
     */
    @Scheduled(cron = "0 17 16 ? * MON-SUN")
    private void configureTasks() throws IOException {
        String url = "https://www.jisilu.cn/data/etf/etf_list/";
        String jsonstr = etfParser.getCall(url);
        JsonRootBean root = (JsonRootBean) etfParser.parseJsonToJavaBean(jsonstr, JsonRootBean.class);
        List<SgdFundEtf> sgdFundEtfs = etfParser.beanToSgdFundEtf(root);
        for (SgdFundEtf sgdFundEtf : sgdFundEtfs) {
            System.out.println(sgdFundEtf.toString());
            iSgdFundEtfService.save(sgdFundEtf);
        }
    }
}
