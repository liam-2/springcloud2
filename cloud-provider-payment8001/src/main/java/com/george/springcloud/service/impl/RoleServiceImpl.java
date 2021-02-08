package com.george.springcloud.service.impl;

import com.george.springcloud.dao.RoleDao;
import com.george.springcloud.domain.RoleDomain;
import com.george.springcloud.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version: 1.0
 * @author: liam
 * @className: RoleServiceImpl.java
 * @packageName: com.easestrategy.sync.service.impl
 * @description:
 * @date: 2021/2/5 17:03
 **/
@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDao roleDao;

	public boolean increaseRole( RoleDomain roleDomain){

		return roleDao.increaseRole(roleDomain)>0;

	}

	public boolean deleteRoleById(Long id){

		return roleDao.deleteRoleById(id)>0;
	}

	public boolean updateRole(RoleDomain roleDomain){

		return roleDao.updateRole(roleDomain)>0;
	}



}




