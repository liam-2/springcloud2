package com.george.springcloud.service.impl;


import com.george.springcloud.dao.DepartmentDao;
import com.george.springcloud.domain.DepartmentDomain;
import com.george.springcloud.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version: 1.0
 * @author: liam
 * @className: DepartmentServiceImpl.java
 * @packageName: com.easestrategy.sync.service.impl
 * @description:
 * @date: 2021/2/5 17:03
 **/
@Service
@Slf4j
public  class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentDao departmentDao;

	public boolean increaseDepartment( DepartmentDomain departmentDomain){

		return departmentDao.increaseDepartment(departmentDomain) > 0;

	}

	public boolean deleteDepartmentById( Long id){

		return departmentDao.deleteDepartmentById(id) > 0;
	}

	public boolean deleteDepartmentByCode( String name){

		return departmentDao.deleteDepartmentByCode(name) > 0;
	}

	public boolean deleteDepartmentByName( String code){

		return departmentDao.deleteDepartmentByName(code) > 0;
	}

	public List<String> getAllCode(){

		return departmentDao.getAllCode();

	}

	public List<String> getAllName( ){

		return departmentDao.getAllName();

	}

	public boolean updateDepartment( DepartmentDomain departmentDomain){
		/*List<String> allCodes=getAllCode(departmentDomain);
		List<String> allNames=getAllName(departmentDomain);
		for(String code:allCodes) {
			if(code.equals(departmentDomain.getCode()))
				return false;
		}
		for(String name:allNames) {
			if(name.equals(departmentDomain.getName()))
				return false;
		}*/

		return departmentDao.updateDepartment(departmentDomain) > 0;

	}








}
