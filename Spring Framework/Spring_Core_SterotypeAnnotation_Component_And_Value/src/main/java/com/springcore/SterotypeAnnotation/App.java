package com.springcore.SterotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.SterotypeAnnotation.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SterotypeAnnotation/configuration/config.xml");
       Employee employee = context.getBean("emp",Employee.class);
       System.out.println(employee);
    }
}