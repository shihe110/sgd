package com.shihe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author admin
 * @Date 2021-03-24 8:57
 * @Version 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String hello(){
        // 配置spring.mvc.static-path-pattern=static/** return配置要注意static前缀，否则找不到静态页面
        return "forward:static/login.html";
    }
}
