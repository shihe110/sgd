package com.shihe.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shihe.pojo.SgdStockOf;
import com.shihe.service.ISgdStockOfService;
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
 * @since 2021-02-19
 */
@Controller
@RequestMapping("/sgdStockOf")
public class SgdStockOfController {

    @Autowired
    private ISgdStockOfService iSgdStockOfService;

    @ResponseBody
    @RequestMapping("/index")
    public List<SgdStockOf> index(){
        QueryWrapper<SgdStockOf> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", "1");
        List<SgdStockOf> list = iSgdStockOfService.list(wrapper);
        return list;
    }

}

