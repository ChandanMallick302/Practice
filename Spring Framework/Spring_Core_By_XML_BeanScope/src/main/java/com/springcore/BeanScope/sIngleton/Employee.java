package com.springcore.BeanScope.sIngleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("1")
	private int id;

	@Value("Chandan")
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