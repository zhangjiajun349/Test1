package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//spring容器启动时加载指定的配置文件
@PropertySource("classpath:/properties/student.properties")
public class StudentController {
	
	@Value("${student.id}")
	private Integer id;
	@Value("${student.name}")
	private String name;
	
	@RequestMapping("getStudent")
	public String getMsg() {
		return "id:"+id+"name:"+name;
	}
}
