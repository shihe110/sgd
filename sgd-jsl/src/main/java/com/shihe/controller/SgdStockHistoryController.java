package com.shihe.controller;


import com.shihe.service.ISgdStockHistoryService;
import com.shihe.service.SgdStockHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
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
 * @since 2021-02-24
 */
@Controller
@RequestMapping("/sgdStockHistory")
public class SgdStockHistoryController {

    @Autowired
    private ISgdStockHistoryService iSgdStockHistoryService;

    @RequestMapping("/profit")
    public ModelAndView profit( @RequestParam(value = "stocks[]") List<String> stocks) throws IOException {

        String res = iSgdStockHistoryService.getResult(stocks);
        ModelAndView mv = new ModelAndView("/history/index");
        mv.addObject("res",res);
        return mv;
    }
    @RequestMapping("/index")
    public ModelAndView profit(String index) throws IOException {
        ArrayList<String> stocks = new ArrayList<>();
        stocks.add(index);
        String res = iSgdStockHistoryService.getResult(stocks);
        ModelAndView mv = new ModelAndView("/history/index");
        mv.addObject("res",res);
        return mv;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");
    }
}

