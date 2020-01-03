package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//如何动态为属性赋值
	//表达式语法: spel表达
	//式类似于el表达式
	//原理:从容器中动态获取名称为demo.name的值为name属性赋值
	@Value("${demo.name}")
	private String name;
	@Value("${demo.age}")
	private Integer age;
	
	
	//字符串本身
	@RequestMapping("/hello")
	public String hello() {
		
		return "傲之猎马人:"+name+"年龄:"+age;
	}
}
