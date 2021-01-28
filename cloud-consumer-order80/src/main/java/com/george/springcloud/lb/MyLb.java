package com.george.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @version: 1.0
 * @author: liam
 * @className: MyLb.java
 * @packageName: com.george.lb
 * @description:
 * @date: 2021/1/28 11:28
 **/
@Component
public class MyLb implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 参考RoundRobinRule 类的源码实现 自定义选择规则
     *
     * @return
     */
    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            //Integer 最大值2147483647
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("---------第几次访问,次数:next=" + next);
        return next;
    }

    /**
     * 负载均衡算法: rest接口第几次请求数%服务器集群总数量=实际调用服务器位置下标.每次服务重启动后rest接口计数从1开始。
     *
     * @param serviceInstances
     * @return
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }


}
