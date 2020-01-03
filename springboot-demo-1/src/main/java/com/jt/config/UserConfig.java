package com.jt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.User;

@Configuration
public class UserConfig {
	
	private Integer id;
	private String username;
	
	@Bean//spring通过配置类实例化bean对象
	public User user() {
		return new User();
	}
}
