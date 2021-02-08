package com.george.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @version: 1.0
 * @author: liam
 * @className: DepartmentDomain.java
 * @packageName: com.easestrategy.sync.domain
 * @description:
 * @date: 2021/2/5 15:55
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDomain {

	private Long id;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private int version;
	private Long parentId;
	private String code;
	private String name;
	private String ancestors;
	private int level;
	private int sort;
	private String remark;
	private int isDelete;


}
