package com.george.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @version: 1.0
 * @author: liam
 * @className: LoadBalancer.java
 * @packageName: com.george.lb
 * @description:
 * @date: 2021/1/28 11:26
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);


}
