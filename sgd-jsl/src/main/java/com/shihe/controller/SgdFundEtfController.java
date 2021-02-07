package com.shihe.controller;


import com.shihe.pojo.SgdFundEtf;
import com.shihe.service.ISgdFundEtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}

