package com.mybaits.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version: 1.0
 * @author: liam
 * @className: Product.java
 * @packageName: com.mybaits.study.entity
 * @description:
 * @date: 2021/2/8 11:39
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
        private Integer id;

        private String name;

        private Double price;



}
