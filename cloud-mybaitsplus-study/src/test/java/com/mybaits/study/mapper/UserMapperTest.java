package com.mybaits.study.mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @version:
 * @author: liam
 * @className: UserMapperTest.java
 * @packageName: com.mybaits.study.mapper
 * @description:
 * @date: 2021/2/8 9:57
 **/
@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    void test(){
        mapper.selectList(null).forEach( System.out::println);

    }



}