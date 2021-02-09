package com.mybaits.study.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version: 1.0
 * @author: liam
 * @className: MybaitsPlusConfig.java
 * @packageName: com.mybaits.study.config
 * @description:
 * @date: 2021/2/8 14:44
 **/
@Configuration
public class MybaitsPlusConfig {
    @Bean//配置修改version
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }


}
