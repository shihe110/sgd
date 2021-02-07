package com.shihe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.shihe.mapper")
@EnableScheduling
public class SgdJslApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgdJslApplication.class, args);
    }
}
