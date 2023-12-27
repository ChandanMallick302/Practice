package com.springmvcjdbc.service;

import com.springmvcjdbc.model.User;

public interface UserService {

	public int registerUser(User user); 
	
	public boolean updateUser(User user);
	
}
