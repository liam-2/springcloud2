package com.george.springcloud.mapper;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @version:
 * @author: liam
 * @className: UserMapperTest.java
 * @packageName: com.george.springcloud.mapper
 * @description:
 * @date: 2021/2/7 20:45
 **/
@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    void test(){
        System.out.println("test6");
        mapper.selectList(null).forEach(System.out::println);

    }

}