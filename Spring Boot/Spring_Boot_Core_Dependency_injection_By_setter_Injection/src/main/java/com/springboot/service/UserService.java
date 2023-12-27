package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dao.UserDao;

@Component
public class UserService {
	
	@Autowired
	private UserDao dao;

	public String saveUser() {
		if(dao.save()) {
		return "register successfull";
		}
		else {
			return "register failed";
		}
	}
}
