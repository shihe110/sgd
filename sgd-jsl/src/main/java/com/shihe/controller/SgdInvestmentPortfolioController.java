package com.shihe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName SgdInvestmentPortfolioController
 * @Description TODO
 * @Author admin
 * @Date 2021-03-17 13:51
 * @Version 1.0
 */
@Controller
@RequestMapping("/investPort")
public class SgdInvestmentPortfolioController {

    @RequestMapping("/invest")
    public ModelAndView investPort(){
        ModelAndView mv = new ModelAndView("/investPort/invest");
        return mv;
    }
}
