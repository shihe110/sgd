package com.shihe.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shihe.pojo.SgdFundEtf;
import com.shihe.pojo.SgdIndexEtf;
import com.shihe.service.ISgdFundEtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shihe
 * @since 2021-02-07
 */
@Controller
@RequestMapping("/sgdFundEtf")
public class SgdFundEtfController {

    @Autowired
    private ISgdFundEtfService iSgdFundEtfService;

    @RequestMapping({"/","/index"})
    @ResponseBody
    public List<SgdFundEtf> index(){
        List<SgdFundEtf> sgdFundEtfs = iSgdFundEtfService.list();
        return sgdFundEtfs;
    }
    @RequestMapping("/pe")
    @ResponseBody
    public List<SgdFundEtf> orderByPe(String orderKey){
        List<SgdFundEtf> sgdFundEtfs = iSgdFundEtfService.orderByPeList(orderKey);
        return sgdFundEtfs;
    }
    @RequestMapping("/fundEtfList")
    public ModelAndView etfList(Page p){
        IPage<SgdFundEtf> page = iSgdFundEtfService.page(new Page<>(1, 100));
        List<SgdFundEtf> list = page.getRecords();
        ModelAndView mv = new ModelAndView("/fundEtf/list");
        mv.addObject("list",list)
        .addObject("curPage",1)
        .addObject("pageSize",100);
        return mv;
    }



}

