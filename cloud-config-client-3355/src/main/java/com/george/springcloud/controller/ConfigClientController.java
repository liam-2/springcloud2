package com.george.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: 1.0
 * @author: liam
 * @className: ConfigClientController.java
 * @packageName: com.george.springcloud.controller
 * @description:
 * @date: 2021/2/1 11:47
 **/
@RestController
@Slf4j
@RefreshScope //必须让运维发送post请求才生效 curl -x post “url”
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

}
