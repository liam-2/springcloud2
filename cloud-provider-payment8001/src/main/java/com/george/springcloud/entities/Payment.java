package com.george.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version: 1.0
 * @author: liam
 * @className: Payment.java
 * @packageName: com.george.springcloud.entities
 * @description:
 * @date: 2021/1/26 14:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;




}
