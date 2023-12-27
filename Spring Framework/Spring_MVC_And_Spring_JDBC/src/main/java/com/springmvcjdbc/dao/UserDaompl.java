package com.springmvcjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springmvcjdbc.model.User;

@Repository
public class UserDaompl implements UserDao {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public int saveUser(User user) {
		String sql="insert into user(name,password,address,age) values(?,?,?,?)";
		int saveUser = template.update(sql,user.getName(),user.getPassword(),user.getAddress(),user.getAge());
		return saveUser;
	}

	@Override
	public boolean updateUser(User user) {
		boolean f=false;
		String sql="update user set password=?, address=?, age=? where name=?";
		template.update(sql,user.getName(),user.getPassword(),user.getAddress(),user.getAge());
		f=true;
		return f;
	}

	@Override
	public boolean deleteUserbyName(String name) {
		boolean f=false;
		String sql="delete from user where name=?";
		template.update(sql,name);
		f=true;
		return f;
	}

	@Override
	public User selectUserByName(String name) {
		String sql="select * from user where name=?";
		RowMapper<User> rowMapper=new RowMapper<User>() {
			
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user=new User();
				user.setName(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setAddress(rs.getString(4));
				user.setAge(rs.getInt(3));
				return user;
			}
		};
		User user = (User) template.query(sql, rowMapper,name);
		return user;
	}

	@Override
	public List<User> selectAllUser() {
		String sql="select * from user";
		RowMapper<User> rowMapper=new RowMapper<User>() {
			
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u=new User();
				u.setName(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setAge(rs.getInt(3));
				u.setAddress(rs.getString(4));
				return u;
			}
		};
		List<User> list = template.query(sql, rowMapper);
		return list;
	}

}
