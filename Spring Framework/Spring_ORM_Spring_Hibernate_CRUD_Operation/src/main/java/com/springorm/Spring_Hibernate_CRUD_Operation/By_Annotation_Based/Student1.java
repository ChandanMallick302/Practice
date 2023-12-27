package com.springorm.Spring_Hibernate_CRUD_Operation.By_Annotation_Based;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {

	@Id
	private int id;
	private String name;
	private String course;

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

}
