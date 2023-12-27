package com.springcore.BeanScope.prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	@Value("2")
	private int id;

	@Value("Rajesh")
	private String name;

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
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}