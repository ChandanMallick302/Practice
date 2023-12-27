package com.springmvcjdbc.dao;

import java.util.List;

import com.springmvcjdbc.model.User;

public interface UserDao {

	public int saveUser(User user);

	public boolean updateUser(User user);

	public boolean deleteUserbyName(String name);

	public User selectUserByName(String name);

	public List<User> selectAllUser();
}
