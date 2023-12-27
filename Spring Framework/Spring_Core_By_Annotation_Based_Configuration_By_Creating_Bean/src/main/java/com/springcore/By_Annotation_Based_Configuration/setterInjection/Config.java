package com.springcore.By_Annotation_Based_Configuration.setterInjection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

	@Bean(name = { "s1", "student" })
	public Student getStudent() {
		Student s = new Student();
		s.setId(1);
		s.setName("Chandan");
		return s;
	}

	@Bean(name = "c")
	@Primary
	public Course getCourse() {
		Course c = new Course();
		Map<String, String> m = new HashMap<String, String>();
		m.put("Java", "2Months");
		m.put("Python", "1Months");
		c.setCourse(m);
		return c;
	}

	@Bean(name = "c")
	public Course getNewCourse() {
		Course c = new Course();
		Map<String, String> m = new HashMap<String, String>();
		m.put("C", "3Months");
		m.put("C++", "1Months");
		c.setCourse(m);
		return c;
	}
}
