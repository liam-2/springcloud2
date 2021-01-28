package com.george.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version: 1.0
 * @author: liam
 * @className: MySelfRule.java
 * @packageName: com.george.myrule
 * @description:
 * @date: 2021/1/27 18:05
 **/
@Configuration
public class MySelfRule {
        @Bean
        public IRule myRule(){

            return new RandomRule();

        }


}
