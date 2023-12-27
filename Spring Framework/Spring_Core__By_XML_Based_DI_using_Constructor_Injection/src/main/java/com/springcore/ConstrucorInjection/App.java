package com.springcore.ConstrucorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ConstrucorInjection.CollectionType.Teacher;
import com.springcore.ConstrucorInjection.PrimitiveType.Student;
import com.springcore.ConstrucorInjection.ReferenceType.Employee;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Constructor Injection Primitive Type
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ConstrucorInjection/PrimitiveType/config.xml");
//        Student student = context.getBean("student2",Student.class);
//        System.out.println(student);

		// Constructor Injection CollectionType
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ConstrucorInjection/CollectionType/config.xml");
//    	Teacher teacher = context.getBean("teacher",Teacher.class);
//    	System.out.println(teacher);

		// Constructor Injection ReferenceType
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/ConstrucorInjection/ReferenceType/config.xml");
		Employee employee = context.getBean("emp",Employee.class);
		System.out.println(employee);

	}

}