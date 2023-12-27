package com.springcore.Annotation_AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Annotation_AutoWiring.inConstructorAutowired.Employee;
import com.springcore.Annotation_AutoWiring.inReferenceAutoWired.Student;
import com.springcore.Annotation_AutoWiring.inSetterMethodAutowired.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		//Annotation_AutoWiring in Reference
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"com/springcore/Annotation_AutoWiring/inReferenceAutoWired/config.xml");
		Student student = context1.getBean("s1", Student.class);
		System.out.println(student);
		
		
		//Annotation_AutoWiring in Setter Method
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/Annotation_AutoWiring/inSetterMethodAutowired/config.xml");
		Teacher teacher = context2.getBean("t1",Teacher.class);
		System.out.println(teacher);
		
		
		//Annotation_AutoWiring in Setter Method
		ApplicationContext context3 = new ClassPathXmlApplicationContext("com/springcore/Annotation_AutoWiring/inConstructorAutowired/config.xml");
		Employee employee = context3.getBean("e1",Employee.class);
		System.out.println(employee);
	}
}