package com.springmvcjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcjdbc.dao.UserDaompl;
import com.springmvcjdbc.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDaompl dao;
	
	@Override
	public int registerUser(User user) {
	int saveUser = dao.saveUser(user);
		return saveUser;
	}
	
	@Override
	public boolean updateUser(User user) {
		boolean updateUser = dao.updateUser(user);
		return updateUser;
	}
}