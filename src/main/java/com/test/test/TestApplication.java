package com.test.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@ComponentScan("com.test.test")       //加载@Service @Control注解类
@MapperScan(value = "com.test.test.mapper")  //mybatis 需要扫描mapper接口
@EnableWebMvc                   //启用mvc
@EnableTransactionManagement    //启用事务管理
public class TestApplication{

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
