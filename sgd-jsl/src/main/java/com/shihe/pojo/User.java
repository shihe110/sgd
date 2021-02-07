package com.shihe.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName User
 * @Description TODO
 * @Author admin
 * @Date 2021-02-05 14:14
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private long id;
    private String name;
    private String pass;
}
