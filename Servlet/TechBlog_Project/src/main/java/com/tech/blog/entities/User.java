package com.tech.blog.entities;

import java.sql.Timestamp;

public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String aboout;
	private Timestamp dateTime;
	private String profile;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String email, String password, String gender, String aboout, Timestamp dateTime, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.aboout = aboout;
		this.dateTime = dateTime;
		this.profile= profile;
	}

	public User(String name, String email, String password, String gender, String aboout, Timestamp dateTime, String profile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.aboout = aboout;
		this.dateTime = dateTime;
		this.profile= profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAboout() {
		return aboout;
	}

	public void setAboout(String aboout) {
		this.aboout = aboout;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	

	
	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "id=" + id + 
				", name= " + name + "<br>"+
				", email= " + email + "<br>"+
				", password= " + password +"<br>"+ 
				", gender= " + gender + "<br>"+
				", aboout= " + aboout +"<br>"+
				", dateTime= " + dateTime+"<br>"+
				", profile= " + profile;
	}

}