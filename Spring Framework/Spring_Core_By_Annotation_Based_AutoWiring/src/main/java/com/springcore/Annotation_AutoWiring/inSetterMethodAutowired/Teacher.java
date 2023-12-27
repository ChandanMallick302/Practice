package com.springcore.Annotation_AutoWiring.inSetterMethodAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {

	private int id;
	private String name;
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}