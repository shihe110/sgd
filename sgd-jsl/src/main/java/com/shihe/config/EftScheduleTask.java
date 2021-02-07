package com.shihe.config;

import com.shihe.pojo.Cell;
import com.shihe.pojo.FundETF;
import com.shihe.pojo.JsonRootBean;
import com.shihe.pojo.Rows;
import com.shihe.service.FundETFService;
import com.shihe.util.ETFParser;
import com.shihe.util.UniqueIdUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName EftScheduleTask
 * @Description TODO
 * @Author admin
 * @Date 2021-02-07 9:55
 * @Version 1.0
 */
@Component
public class EftScheduleTask {
    @Autowired
    private ETFParser etfParser;

    @Autowired
    private FundETFService fundETFService;

    @Scheduled(cron = "0 15 10 ? * MON-FRI")
    private void configureTasks() throws IOException {
        String url = "https://www.jisilu.cn/data/etf/etf_list/";
        String jsonstr = etfParser.getCall(url);
        JsonRootBean root = (JsonRootBean) etfParser.parseJsonToJavaBean(jsonstr, JsonRootBean.class);
        List<Rows> rows = root.getRows();
        for (Rows row : rows) {
            FundETF etf = new FundETF();
            BeanUtils.copyProperties(row.getCell(), etf);
            String id = UniqueIdUtil.genId();
            etf.setId(id);
//            fundETFService.add(etf);
        }
    }
}
