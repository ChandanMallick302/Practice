package com.springboot.service;

import org.springframework.stereotype.Component;

import com.springboot.dao.UserDao;

@Component
public class UserService {
	
	private UserDao dao;

	
	public UserService(UserDao dao) {
		super();
		this.dao = dao;
	}


	public String saveUser() {
		if(dao.save()) {
		return "register successfull";
		}
		else {
			return "register failed";
		}
	}
}
