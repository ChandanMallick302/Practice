package com.springcore.DependingInjection.SetterInjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.DependingInjection.SetterInjection.CollectionType.Student;
import com.springcore.DependingInjection.SetterInjection.PrimitiveDataType.Person;
import com.springcore.DependingInjection.SetterInjection.ReferenceType.Employee;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// SetterInjection PrimitiveDataType
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/springcore/DependingInjection/setterInjection/PrimitiveDataType/config.xml");
//		
//		Person person1 = context.getBean("person1",Person.class);
//		System.out.println("Setter Injection : "+person1.getId());
//		System.out.println("Setter Injection : "+person1.getName());
//		System.out.println("Setter Injection : "+person1.getAddress());
//		
//		Person person2 = context.getBean("person2",Person.class);
//		System.out.println("Setter Injection : "+person2.getId());
//		System.out.println("Setter Injection : "+person2.getName());
//		System.out.println("Setter Injection : "+person2.getAddress());

		// SetterInjection CollectionType
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/DependingInjection/SetterInjection/CollectionType/config.xml");

		Student student = context.getBean("student", Student.class);
		System.out.println(student.getName());
	
		//For List
		System.out.println(student.getAddress().get(0));
		
		//For Set
		student.getPhone().forEach(e->{System.out.println("Phone No: "+e);});
		
		//For Map
		student.getCourse().forEach((key,value)->{System.out.println(key+" "+value);});

		// SetterInjection ReferenceType
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/springcore/DependingInjection/SetterInjection/ReferenceType/config.xml");
//
//		Employee employee = context.getBean("emp", Employee.class);
//		System.out.println("Name : " + employee.getName());
//		System.out.println("City : " + employee.getAddress().getCity());
//		System.out.println("State : " + employee.getAddress().getState());
//		System.out.println("Pin : " + employee.getAddress().getPin());

	}
}
