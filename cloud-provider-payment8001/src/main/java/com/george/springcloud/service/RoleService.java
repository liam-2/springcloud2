package com.george.springcloud.service;


import com.george.springcloud.domain.RoleDomain;

/**
 * @version: 1.0
 * @author: liam
 * @className: RoleService.java
 * @packageName: com.easestrategy.sync.service
 * @description:
 * @date: 2021/2/5 17:02
 **/
public interface RoleService {


	boolean increaseRole(RoleDomain roleDomain);

	boolean deleteRoleById(Long id);

	boolean updateRole(RoleDomain roleDomain);


}
