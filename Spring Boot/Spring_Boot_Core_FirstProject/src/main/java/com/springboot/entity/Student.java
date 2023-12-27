package com.springboot.entity;

import org.springframework.stereotype.Component;

@Component(value ="s1")
public class Student {

	private int id;
	private String name;
	
	public String student(int id,String name) {
		this.id=id;
		this.name=name;
		return this.id+" "+this.name;
	}
}
