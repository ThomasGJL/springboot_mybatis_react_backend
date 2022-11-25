package com.example.springbootmybatisreact;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisreact.mapper")
public class SpringbootMybatisReactApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisReactApplication.class, args);
    }

}
