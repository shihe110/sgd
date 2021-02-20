package com.shihe.controller;


import com.shihe.pojo.SgdStockOfdata;
import com.shihe.service.ISgdStockOfdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shihe
 * @since 2021-02-20
 */
@Controller
@RequestMapping("/sgdStockOfdata")
public class SgdStockOfdataController {

    @Autowired
    private ISgdStockOfdataService iSgdStockOfdataService;

    @RequestMapping("/list")
    public ModelAndView list(){
        List<SgdStockOfdata> list = iSgdStockOfdataService.getStocksOfMine();
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("list",list);
        return mv;
    }

}

