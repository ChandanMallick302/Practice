package com.springmvcorm.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String password;

	private String address;

	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, String password, String address, int age) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.age = age;
	}

	public User(int id, String name, String password, String address, int age) {
		super();
		this.id = id;
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