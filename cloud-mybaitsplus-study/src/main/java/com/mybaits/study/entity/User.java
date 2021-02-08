package com.mybaits.study.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value="user")
public class User implements Serializable {

	//private static final long serialVersionUID = 1L;
	@TableId(value = "id" )
	private Integer id;

	@TableField(value = "name")
	private String name;

	private Integer age;



}