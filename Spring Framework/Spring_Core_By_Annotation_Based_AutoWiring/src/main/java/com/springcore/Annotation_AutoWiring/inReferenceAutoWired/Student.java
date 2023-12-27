package com.springcore.Annotation_AutoWiring.inReferenceAutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int id;
	private String name;
	
	@Autowired
	@Qualifier("c1")// If more than one bean present in configuration file then use @Qualifier
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}
