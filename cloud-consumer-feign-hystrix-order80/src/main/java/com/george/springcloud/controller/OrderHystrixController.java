package com.george.springcloud.controller;

import com.george.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yang Hao
 * @description
 * @date 2020-09-16 16:38
 */
//通配》专用》全局
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")//没配置找default
@RestController
@Slf4j
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
       // int a=10/0;
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }



    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "PaymentTimeOutFallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        //int age = 10 / 0;
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        return result;
    }

    public String PaymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "我是消费者80，对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己，o(╥﹏╥)o";
    }

    /**
     * 全局fallback 降级方法
     * <p>
     * 需要注释一些属性,没有特别指明,就用统一的方法
     * //    @HystrixCommand(fallbackMethod = "PaymentTimeOutFallbackMethod", commandProperties = {
     * //            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
     * //    })
     * <p>
     * 替换成@HystrixCommand一个注解
     *
     * @return
     */
   public String payment_Global_FallbackMethod() {
        return "Global异常处理信息，请稍后再试，o(╥﹏╥)o";
    }
}
