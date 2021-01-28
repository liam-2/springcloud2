package com.george.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version: 1.0
 * @author: liam
 * @className: ApplicationContextConfig.java
 * @packageName: com.george.springcloud.config
 * @description:
 * @date: 2021/1/27 10:48
 **/
@Configuration
public class ApplicationContextConfig {

    //@LoadBalanced 使用自己的算法
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }


}
