package com.shihe.controller;


import com.shihe.pojo.SgdPupFlow;
import com.shihe.pojo.SgdStock;
import com.shihe.service.ISgdPupFlowService;
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
 * @since 2021-02-09
 */
@Controller
@RequestMapping("/sgdPupFlow")
public class SgdPupFlowController {

    @Autowired
    private ISgdPupFlowService iSgdPupFlowService;

    @RequestMapping("/")
    @ResponseBody
    public List<SgdPupFlow> list(){
        List<SgdPupFlow> list = iSgdPupFlowService.list();
        return list;
    }
}

