package com.mybaits.study.enums;


import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @version: 1.0
 * @author: liam
 * @className: AgeEnum.java
 * @packageName: com.mybaits.study.enums
 * @description:
 * @date: 2021/2/8 16:10
 **/
public enum AgeEnum implements IEnum<Integer>{
    ONE(1, "⼀岁"),
    THREE(3, "三岁"),
    TWO(2, "两岁");
    private Integer code;
    private String msg;

    AgeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }
}
