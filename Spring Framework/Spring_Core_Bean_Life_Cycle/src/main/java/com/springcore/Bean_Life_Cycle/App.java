package com.springcore.Bean_Life_Cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Bean_Life_Cycle.By_Annotaion.Employee;
import com.springcore.Bean_Life_Cycle.By_Implementing_Interface.Teacher;
import com.springcore.Bean_Life_Cycle.By_XML.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	//Bean_Life_Cycle By_XML
//        AbstractApplicationContext context1=new ClassPathXmlApplicationContext("com/springcore/Bean_Life_Cycle/By_XML/config.xml");
    	
//    context1.registerShutdownHook();//To enable destroy method
    	
//        Student student = context1.getBean("s1",Student.class);
//    System.out.println(student);
//    	
    	
    	
    	//Bean_Life_Cycle By_Implementing_Interface
//    	AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/Bean_Life_Cycle/By_Implementing_Interface/config.xml");
    	
//    	context2.registerShutdownHook();//To enable destroy method
    	
//    	Teacher teacher = context2.getBean("t1",Teacher.class);
//    	System.out.println(teacher);
    	
    	
    	
    	//Bean_Life_Cycle By_Annotaion
    	AbstractXmlApplicationContext context3 = new ClassPathXmlApplicationContext("com/springcore/Bean_Life_Cycle/By_Annotaion/config.xml");
    	context3.registerShutdownHook();//To enable destroy() method
    	Employee employee = context3.getBean("e1", Employee.class);
    	System.out.println(employee);
    	
    }
}
