package com.tech.blog.dao;

import java.sql.*;

import com.tech.blog.entities.User;

public class UserDao {
private Connection con;

public UserDao(Connection con) {
	this.con=con;
}

// Method to insert into database

public boolean saveUser(User user)throws Exception {
	boolean f=false;
	try {
		
		//user object to database
		String query="insert into user(name,email,password,gender,about)values(?,?,?,?,?)";
		PreparedStatement pstmt = this.con.prepareStatement(query);
		
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getEmail());
		pstmt.setString(3, user.getPassword());
		pstmt.setString(4, user.getGender());
		pstmt.setString(5, user.getAboout());
		pstmt.executeUpdate();
		f=true;
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return f;
}
public User getUserByEmailAndPassword(String email, String password) {

	User user=null;
	try{
		String query="select * from user where email=? and password=?";
		PreparedStatement pstmt = this.con.prepareStatement(query);
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		ResultSet set = pstmt.executeQuery();
		
		if(set.next()) {
			user=new User();
			String db_email = set.getString("email");
			String db_password = set.getString("password");
			String db_name = set.getString("name");
			String db_gender = set.getString("gender");
			String db_about = set.getString("about");
			Timestamp db_timestamp = set.getTimestamp("r_date");
			String db_profile=set.getString("profile");
			
			user.setName(db_name);
			user.setEmail(db_email);
			user.setPassword(db_password);
			user.setGender(db_gender);
			user.setAboout(db_about);
			user.setDateTime(db_timestamp);
			user.setProfile(db_profile);
		}
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	
	return user;
}
	
}
