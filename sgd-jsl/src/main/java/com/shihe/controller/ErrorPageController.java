package com.shihe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName ErrorPageController
 * @Description TODO
 * @Author admin
 * @Date 2021-03-24 8:37
 * @Version 1.0
 */
@Controller
public class ErrorPageController {

    @RequestMapping("/404")
    public ModelAndView notFund(){
        return new ModelAndView("/error/404");
    }
    @RequestMapping("/400")
    public ModelAndView badRequest(){
        return new ModelAndView("/error/400");
    }
    @RequestMapping("/500")
    public ModelAndView internalServerError(){
        return new ModelAndView("/error/500");
    }
}
