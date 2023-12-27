package com.springcore.PropertySources_Annotation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class Student1 {

	@Value("${student.id}")
	private int id;

	@Value("${student.name}")
	private String name;

	@Value("${address.city}")
	private String city;
	
	@Value("${address.state}")
	private String state;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
}