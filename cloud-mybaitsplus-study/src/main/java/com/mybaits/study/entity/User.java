package com.mybaits.study.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.mybaits.study.enums.AgeEnum;
import com.mybaits.study.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value="user")
public class User implements Serializable {

	//private static final long serialVersionUID = 1L;
	@TableId(value = "id",type= IdType.INPUT)
	//主键type:none:雪花算法，
	// auto即使手动赋值也要自增，
	// input不赋值看数据库策略，
	//assignid雪花算法
	//assignuuid主键数据类型必须是String
	private Long id;

	@TableField(value = "name")
	private String name;

	//private Integer age;
	private AgeEnum age;
	@TableField(exist=false)//不需要映射
	private String gender;

	//private Product product;
	@TableField(fill= FieldFill.INSERT)
	private Date createTime;
	@TableField(fill= FieldFill.INSERT_UPDATE)//mybaits自动赋值策略
	private Date updateTime;
	@Version//乐观锁标记
	private Integer version;
	private StatusEnum status;
	@TableLogic//逻辑删除
	private Integer deleted;




}