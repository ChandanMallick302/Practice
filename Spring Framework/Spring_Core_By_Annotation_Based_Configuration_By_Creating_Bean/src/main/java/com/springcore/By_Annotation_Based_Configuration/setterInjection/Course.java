package com.springcore.By_Annotation_Based_Configuration.setterInjection;

import java.util.Map;

import org.springframework.stereotype.Component;
//@Component("s1")// it will work, but i am going to use @bean
public class Course {

	private Map<String, String> course;

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Course [course=" + course + "]";
	}
}