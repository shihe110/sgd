package com.shihe.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shihe.pojo.SgdStockOf;
import com.shihe.pojo.SgdStockOfdata;
import com.shihe.pojo.dto.StockPEG;
import com.shihe.service.ISgdStockOfService;
import com.shihe.service.ISgdStockOfdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shihe
 * @since 2021-02-19
 */
@Controller
@RequestMapping("/sgdStockOf")
public class SgdStockOfController {

    @Autowired
    private ISgdStockOfService iSgdStockOfService;

    @Autowired
    private ISgdStockOfdataService iSgdStockOfdataService;

    @ResponseBody
    @RequestMapping("/index")
    public List<SgdStockOfdata> index(){
        QueryWrapper<SgdStockOf> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", "1");
        List<SgdStockOf> list = iSgdStockOfService.list(wrapper);

        List<String> codes = getListOfMineCode(list);
        List<SgdStockOfdata> ss = iSgdStockOfdataService.listOfMyStocks(codes);
        return ss;
    }

    private List<String> getListOfMineCode(List<SgdStockOf> list) {
        ArrayList<String> codes = new ArrayList<>();
        for (SgdStockOf sgdStockOf : list) {
            codes.add(sgdStockOf.getsCode());
        }
        return codes;
    }

    @RequestMapping("/peg")
    public ModelAndView seg(String id) throws IOException {
        QueryWrapper<SgdStockOf> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",id);
        List<SgdStockOf> list = iSgdStockOfService.list(wrapper);
        ArrayList<StockPEG> stockSEGS = new ArrayList<>();
        for (SgdStockOf stockOf : list) {
            StockPEG seg = iSgdStockOfService.getPeg(stockOf);
            stockSEGS.add(seg);
        }
        ModelAndView mv = new ModelAndView("/stockOf/seg");
        mv.addObject("list",stockSEGS);
        return mv;
    }

    public static void main(String[] args) {
        double a = 188.28d;
        double rate = 0.7;
        System.out.println(a * rate);
    }

}

