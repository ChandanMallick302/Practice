package com.springcore.PropertySource_Annotation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

	@Value("${student.id}")
	private int id;

	@Value("${student.name}")
	private String name;

	
	private String city;
	
	private String state;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}