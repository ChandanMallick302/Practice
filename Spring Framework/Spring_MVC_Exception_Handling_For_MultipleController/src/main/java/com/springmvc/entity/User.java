package com.springmvc.entity;

public class User {

	private String email;
	
	private String password;
	
	private String city;
	
	private String gender;
	
	private int age;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password, String city, String gender, int age) {
		super();
		this.email = email;
		this.password = password;
		this.city = city;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", city=" + city + ", gender=" + gender + ", age="
				+ age + "]";
	}
	
	
}
