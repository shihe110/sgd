package com.shihe.mapper;

import com.shihe.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @InterfaceName UserMapper
 * @Description TODO
 * @Author admin
 * @Date 2021-02-05 15:49
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    void add(User user);
}
