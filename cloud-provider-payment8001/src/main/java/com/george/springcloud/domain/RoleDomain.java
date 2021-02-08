package com.george.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @version: 1.0
 * @author: liam
 * @className: RoleDomain.java
 * @packageName: com.easestrategy.sync.domain
 * @description:
 * @date: 2021/2/5 15:55
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDomain {

	private Long id;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private int version;
	private Long parentId;
	private String name;
	private String code;
	private int sort;
	private String remark;
	private int isDisable;
	private int isDelete;


}
