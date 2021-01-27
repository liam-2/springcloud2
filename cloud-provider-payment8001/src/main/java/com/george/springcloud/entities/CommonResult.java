package com.george.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version: 1.0
 * @author: liam
 * @className: CommonResult.java
 * @packageName: com.george.springcloud.entities
 * @description:
 * @date: 2021/1/26 14:10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }

}
