package com.shihe.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shihe.pojo.SgdFundEtf;
import com.shihe.pojo.SgdUserStock;
import com.shihe.service.ISgdFundEtfService;
import com.shihe.service.ISgdUserStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shihe
 * @since 2021-02-09
 */
@Controller
@RequestMapping("/sgdUserStock")
public class SgdUserStockController {

    @Autowired
    private ISgdUserStockService iSgdUserStockService;

    @Autowired
    private ISgdFundEtfService iSgdFundEtfService;

    @RequestMapping("/")
    @ResponseBody
    public List<List<SgdFundEtf>> sgdFundEtfListOfMine(){
        String userid = "1";
        QueryWrapper<SgdUserStock> wrapper = new QueryWrapper<SgdUserStock>();
        wrapper.eq("user_id",userid);
        List<SgdUserStock> userStocks = iSgdUserStockService.list(wrapper);

        List<List<SgdFundEtf>> results = new ArrayList<>();
        for (SgdUserStock userStock : userStocks) {
            QueryWrapper<SgdFundEtf> etfwrapper = new QueryWrapper<SgdFundEtf>();
            String stockCode = userStock.getStockCode();
            etfwrapper.eq("fund_id",stockCode);

            List<SgdFundEtf> etfs = iSgdFundEtfService.list(etfwrapper);
            results.add(etfs);

        }
        return results;
    }
}

