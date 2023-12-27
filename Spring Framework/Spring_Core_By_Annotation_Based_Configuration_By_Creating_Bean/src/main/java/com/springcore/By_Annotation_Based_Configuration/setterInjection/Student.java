package com.springcore.By_Annotation_Based_Configuration.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("s1")// it will work, but i am going to use @bean
public class Student {

	private int id;

	private String name;

	@Autowired
	private Course course;

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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	

	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}