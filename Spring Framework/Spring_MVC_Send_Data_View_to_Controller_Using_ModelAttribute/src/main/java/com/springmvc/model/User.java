package com.springmvc.model;

public class User {

	private String name;
	
	private int age;
	
	private String password;
	
	private String check;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public User(String name, int age, String password, String check) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
		this.check = check;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", password=" + password + ", check=" + check + "]";
	}
}
