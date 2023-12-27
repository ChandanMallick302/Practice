package com.springcoreAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoreAutoWiring.Constructor.Employee;
import com.springcoreAutoWiring.byName.Student;
import com.springcoreAutoWiring.byType.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Autowired byName
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoreAutoWiring/byName/config.xml");
		Student student = context.getBean("s1",Student.class);
		System.out.println(student);
		
		//Autowired byType
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcoreAutoWiring/byType/config.xml");
		Teacher teacher = context2.getBean("t1",Teacher.class);
		System.out.println(teacher);
		
		//Autowired by using Constructor
		ApplicationContext context3 = new ClassPathXmlApplicationContext("com/springcoreAutoWiring/Constructor/config.xml");
		Employee employee = context3.getBean("e1",Employee.class);
		System.out.println(employee);
	}
}