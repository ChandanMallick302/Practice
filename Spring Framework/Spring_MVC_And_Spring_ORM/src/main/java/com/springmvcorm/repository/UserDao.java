package com.springmvcorm.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvcorm.Entity.User;


@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate template; 
	
	
	public int saveUser(User user) {
		int saveUser = (int)template.save(user);
		return saveUser;
	}
	public void updateUser(User user) {
		template.update(user);
	}
	public void deleteUserByName(String name) {
		template.delete(name);
	}
	public User selectByName(String name) {
		User user = template.get(User.class, name);
		return user;
	}
	public List<User> selectAllUser(){
		List<User> loadAll = template.loadAll(User.class);
		return loadAll;
	}
}