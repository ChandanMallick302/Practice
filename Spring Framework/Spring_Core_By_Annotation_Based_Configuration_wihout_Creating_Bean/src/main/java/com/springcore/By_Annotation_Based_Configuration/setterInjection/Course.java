package com.springcore.By_Annotation_Based_Configuration.setterInjection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("c1")
public class Course {
	
	@Value("#{{'java': '2-Months', 'Python': '1-Months'}}")
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