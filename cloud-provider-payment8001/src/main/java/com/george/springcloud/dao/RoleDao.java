package com.george.springcloud.dao;


import com.george.springcloud.domain.RoleDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @version: 1.0
 * @author: liam
 * @className: RoleDao.java
 * @packageName: com.easestrategy.sync.dao
 * @description:
 * @date: 2021/2/5 15:53
 **/
@Mapper
public interface RoleDao {


    int increaseRole(@Param("roleDomain") RoleDomain roleDomain);

	int deleteRoleById(@Param("roleId")Long id);

	int updateRole(@Param("roleDomain")RoleDomain roleDomain);


}
