package com.springcore.Annotation_AutoWiring.inReferenceAutoWired;

import java.util.Map;

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
