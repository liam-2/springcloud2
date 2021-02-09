package com.mybaits.study.mapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybaits.study.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    @Resource
    private UserMapper mapper;
    @Test
    void test(){
        mapper.selectList(null).forEach( System.out::println);

    }
    @Test
    void ave(){
        User user=new User();
        user.setName("小怪");
       // user.setAge(5245);
        mapper.insert(user);



    }
    @Test
    void update(){
        User user1=mapper.selectById(6);
        user1.setName("111");

      User user2=mapper.selectById(6);
        user2.setName("222");

                mapper.updateById(user2);
                mapper.updateById(user1);




    }
    @Test
    void delete(){
        //mapper.deleteById(1);

        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("name","猪八戒");
        mapper.delete(queryWrapper);
    }
    @Test
    void select(){
        QueryWrapper queryWrapper=new QueryWrapper();
       // Map<String,Object> map=new HashMap<>();
       // map.put("name","猪八戒");
       // map.put("age",3);
      //  queryWrapper.allEq(map);
        queryWrapper.eq("name","猪八戒0");
        //queryWrapper.ge("age",1);
      //  queryWrapper.likeLeft("name",0);
      //  queryWrapper.inSql("id","select id from user where id>3");
        //queryWrapper.orderByAsc("age");
       // queryWrapper.gt("age",1);//age>1
      //  System.out.println(mapper.selectList(queryWrapper));
       // mapper.selectMaps(queryWrapper).forEach( System.out::println);

        //分页查询
       /* Page<User> page=new Page<>(1,2);
        Page<User> result=mapper.selectPage(page,null);
        System.out.println(result.getSize()+result.getTotal());
        result.getRecords().forEach(System.out::println);*/
        /*Page<Map<String,Object>> page=new Page<>(1,2);
        mapper.selectMapsPage(page,null).getRecords().forEach(System.out::println);*/
        //mapper.selectObjs()
       // System.out.println(mapper.selectOne(queryWrapper)) ;
        mapper.PRODUCT_VO_LIST(3).forEach(System.out::println);//关联查询


    }



}