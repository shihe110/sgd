package com.shihe.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shihe.pojo.SgdIndexEtf;
import com.shihe.service.ISgdIndexEtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shihe
 * @since 2021-02-21
 */
@Controller
@RequestMapping("/sgdIndexEtf")
public class SgdIndexEtfController {

    @Autowired
    private ISgdIndexEtfService iSgdIndexEtfService;

    @GetMapping("/index")
    public String index(){
        return "/indexEtf/list";
    }

    @RequestMapping("/indexEtf")
    public ModelAndView indexEtf(String index){
        QueryWrapper<SgdIndexEtf> w = new QueryWrapper<>();
        w.eq("index_type",index);
        IPage<SgdIndexEtf> page = iSgdIndexEtfService.page(new Page<>(1, 100), w);
        List<SgdIndexEtf> indexEtfs = page.getRecords();
        ModelAndView mv = new ModelAndView("/indexEtf/list");
        return mv.addObject("indexEtf", indexEtfs);
    }

    @RequestMapping("/indexEtf1")
    @ResponseBody
    public List<SgdIndexEtf> indexEtf1(String index){
        QueryWrapper<SgdIndexEtf> w = new QueryWrapper<>();
        w.eq("index_type",index);
        IPage<SgdIndexEtf> page = iSgdIndexEtfService.page(new Page<>(1, 100), w);
        List<SgdIndexEtf> indexEtfs = page.getRecords();
        return indexEtfs;
    }
}

