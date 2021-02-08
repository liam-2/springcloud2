package com.george.springcloud.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	//private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private Integer age;

}