package com.george.springcloud.dao;


import com.george.springcloud.domain.DepartmentDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version: 1.0
 * @author: liam
 * @className: DepartmentDao.java
 * @packageName: com.easestrategy.sync.dao
 * @description:
 * @date: 2021/2/5 15:53
 **/
@Mapper
public interface DepartmentDao {

	int increaseDepartment(@Param("departmentDomain") DepartmentDomain departmentDomain);

	int deleteDepartmentById(@Param("departmentId") Long id);

	int deleteDepartmentByCode(@Param("code") String code);

	int deleteDepartmentByName(@Param("name") String name);

	int updateDepartment(@Param("departmentDomain") DepartmentDomain departmentDomain);

	List<String> getAllCode();

	List<String> getAllName();

}
