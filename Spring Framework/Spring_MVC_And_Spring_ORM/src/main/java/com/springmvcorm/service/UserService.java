package com.springmvcorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcorm.Entity.User;
import com.springmvcorm.repository.UserDao;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	@Transactional
	public int registerUser(User user) {
		int saveUser = dao.saveUser(user);
		return saveUser;
	}
}
