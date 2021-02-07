package com.shihe.controller;

import com.shihe.pojo.Cell;
import com.shihe.pojo.JsonRootBean;
import com.shihe.pojo.Rows;
import com.shihe.pojo.User;
import com.shihe.util.ETFParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @ClassName FundETFController
 * @Description TODO
 * @Author admin
 * @Date 2021-02-04 15:10
 * @Version 1.0
 */
@RestController
public class FundETFController {

    @Autowired
    private ETFParser etfParser;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping({"/","/index"})
    public List<Rows> fundETF() throws IOException {
        String url = "https://www.jisilu.cn/data/etf/etf_list/";
        String jsonstr = etfParser.getCall(url);
        JsonRootBean root = (JsonRootBean) etfParser.parseJsonToJavaBean(jsonstr, JsonRootBean.class);
        List<Rows> rows = root.getRows();
        
        String sql = "select * from sgd_user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps.toString());

        RowMapper<User> mapper = new BeanPropertyRowMapper<>(User.class);
        List<User> query = jdbcTemplate.query(sql, mapper);
        for (User user : query) {
            System.out.println(user);
        }

        return rows;
    }
}
