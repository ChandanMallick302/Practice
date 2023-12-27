package com.springcore.By_Annotation_Based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.By_Annotation_Based_Configuration.ConstructorInjection.Employee;
import com.springcore.By_Annotation_Based_Configuration.setterInjection.Config;
import com.springcore.By_Annotation_Based_Configuration.setterInjection.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	//By Annotation Based Configuration setterInjection
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = context.getBean("s1",Student.class);
        System.out.println(student);
        
      //By Annotation Based Configuration constructor Injection
        
        ApplicationContext context2 = new AnnotationConfigApplicationContext(com.springcore.By_Annotation_Based_Configuration.ConstructorInjection.Config.class);
        Employee employee = context2.getBean("employee",Employee.class);
        System.out.println(employee);
    }
}
