package com.shihe.service;

import com.shihe.mapper.UserMapper;
import com.shihe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @InterfaceName UserService
 * @Description TODO
 * @Author admin
 * @Date 2021-02-05 15:52
 * @Version 1.0
 */
public interface UserService {

    List<User> findAll();

}
