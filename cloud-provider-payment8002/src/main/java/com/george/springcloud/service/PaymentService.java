package com.george.springcloud.service;

import com.george.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @version: 1.0
 * @author: liam
 * @className: PaymentService.java
 * @packageName: com.george.springcloud.service
 * @description:
 * @date: 2021/1/27 15:29
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
