package com.mybaits.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * @author Yang Hao
 * @date 2020/9/14
 */
@SpringBootApplication
@MapperScan("com.mybaits.study.mapper")
public class MybaitsStudy {
    public static void main(String[] args) {
        SpringApplication.run(MybaitsStudy.class, args);
    }
}
