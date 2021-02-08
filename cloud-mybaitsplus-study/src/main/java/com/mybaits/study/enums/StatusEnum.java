package com.mybaits.study.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @version: 1.0
 * @author: liam
 * @className: StatusEnum.java
 * @packageName: com.mybaits.study.enums
 * @description:
 * @date: 2021/2/8 15:17
 **/
public enum StatusEnum {

   WORK(1,"上班"),
   REST(0,"休息");


    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    @EnumValue
    private Integer code;
    private String msg;
}
