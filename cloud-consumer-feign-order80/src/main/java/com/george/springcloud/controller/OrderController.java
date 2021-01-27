package com.george.springcloud.controller;




import com.george.springcloud.entities.CommonResult;
import com.george.springcloud.entities.Payment;
import com.netflix.ribbon.proxy.annotation.Http;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.CookieManager;

/**
 * @author Yang Hao
 * @description
 * @date 2020-09-16 16:43
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL="http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping ("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForEntity(PAYMENT_URL+"/payment/create",payment,CommonResult.class).getBody();
        //return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){

        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
    @GetMapping("/consumer/payment/getfForEntity/{id}")
    public CommonResult<Payment>  getPayment2(@PathVariable("id") Long id){

        ResponseEntity<CommonResult> entity =restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){


            return  entity.getBody();

        }else{

            return  new CommonResult<>(444,"操作失败");

        }
   /* @PostMapping("/consumer/payment/create2")
    public CommonResult<Payment> create2(Payment payment){

            return restTemplate.postForEntity(PAYMENT_URL+"/payment/create",payment,CommonResult.class).getBody();
        }
*/



    }

}
