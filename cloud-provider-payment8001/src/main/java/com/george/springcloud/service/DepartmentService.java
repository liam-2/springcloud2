package com.george.springcloud.service;



import com.george.springcloud.domain.DepartmentDomain;

import java.util.List;

/**
 * @author was
 * @date 2021-02-05 15:24
 * <p>
 * 说明
 */
public interface DepartmentService {

	boolean increaseDepartment( DepartmentDomain departmentDomain);

	boolean deleteDepartmentById( Long id);

	boolean deleteDepartmentByCode( String name);

	boolean deleteDepartmentByName( String code);

	boolean updateDepartment( DepartmentDomain departmentDomain);

	List<String> getAllCode();

	List<String> getAllName();



}
