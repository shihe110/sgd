package com.shihe.controller;

import com.shihe.pojo.User;
import com.shihe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author admin
 * @Date 2021-02-05 15:55
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping({"/user"})
    public List<User> findAll(){
        List<User> users = userService.findAll();
        return users;
    }

    @RequestMapping("/add")
    public void add(){
        User user = new User();
        user.setId(3);
        user.setName("wangwu");
        user.setPass("123456");
        System.out.println(user.toString());
        userService.add(user);

    }
}
