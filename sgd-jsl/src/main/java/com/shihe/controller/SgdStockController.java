package com.shihe.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shihe.pojo.SgdStock;
import com.shihe.service.ISgdStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shihe
 * @since 2021-02-08
 */
@Controller
@RequestMapping("/sgdStock")
public class SgdStockController {

    @Autowired
    private ISgdStockService iSgdStockService;

    @RequestMapping("/")
    @ResponseBody
    public List<SgdStock> stockList(){
        IPage<SgdStock> page = iSgdStockService.page(new Page<>(1, 20));
        return page.getRecords();
    }


}

