package com.springmvcjdbc.model;

public class User {

	private String name;
	
	private String password;
	
	private String address;
	
	private int age;

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public User(String name, String password, String address, int age) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", address=" + address + ", age=" + age + "]";
	}
}