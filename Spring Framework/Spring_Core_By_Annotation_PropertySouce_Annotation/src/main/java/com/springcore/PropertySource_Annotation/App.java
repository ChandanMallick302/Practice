package com.springcore.PropertySource_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.PropertySource_Annotation.entity.Config;
import com.springcore.PropertySource_Annotation.entity.Student;
import com.springcore.PropertySources_Annotation.entity.Student1;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// By Annotation Based Configuration setterInjection
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean("s1", Student.class);
		System.out.println(student);
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(com.springcore.PropertySources_Annotation.entity.Config.class);
		Student1 student1 = context1.getBean("s", Student1.class);
		System.out.println(student1);
	}
}