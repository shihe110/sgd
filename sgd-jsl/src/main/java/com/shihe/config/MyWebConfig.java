package com.shihe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @ClassName MyWebConfig
 * @Description TODO
 * @Author admin
 * @Date 2021-03-02 13:29
 * @Version 1.0
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将物理地址upload下的文件映射到/upload下
        //访问的时候就直接访问http://localhost:9000/upload/文件名
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:"+System.getProperty("user.dir")+"/upload/");
    }

    /**
     * 相当于controller没有业务逻辑，直接跳转hello页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("forward:login.html");
        registry.addViewController("/hello/index").setViewName("hello");
    }
}
