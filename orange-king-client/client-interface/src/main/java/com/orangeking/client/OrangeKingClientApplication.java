package com.orangeking.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by Yashon on 2017/3/1.
 */
@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
//@EnableAutoConfiguration
@ServletComponentScan
@MapperScan(basePackages = "com.orangeking.client.dao.mapper")
public class OrangeKingClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrangeKingClientApplication.class, args);
    }
}
