package com.mybaits.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybaits.study.entity.ProductVo;
import com.mybaits.study.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @version: 1.0
 * @author: liam
 * @className: UserMapper.java
 * @packageName: com.george.springcloud.mapper
 * @description:
 * @date: 2021/2/7 20:31
 **/

public interface UserMapper extends BaseMapper<User> {

    @Select("select p.*,u.name from product p,user u where p.user_id=u.id and u.id=#{id}")
    List<ProductVo> PRODUCT_VO_LIST(Integer id);






}
