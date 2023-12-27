package com.springcore.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.BeanScope.prototype.Teacher;
import com.springcore.BeanScope.sIngleton.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//For Singleton scope
       ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/BeanScope/sIngleton/config.xml");
       Employee emp1 = context1.getBean("emp",Employee.class);
       
//       to check the object reference number
       System.out.println(emp1.hashCode());
       
       Employee emp2=context1.getBean("emp",Employee.class);
       System.out.println(emp2.hashCode());
       
//       The output will be same because singleton will create one object and it use same object in every time
       
       
       //For Prototype Scope
       ApplicationContext context2=new ClassPathXmlApplicationContext("com/springcore/BeanScope/prototype/config.xml");
       Teacher teacher1 = context2.getBean("t1",Teacher.class);
       System.out.println(teacher1.hashCode());
       
       Teacher teacher2 = context2.getBean("t1",Teacher.class);	
       System.out.println(teacher2.hashCode()); 
       
//     The output will be same because singleton will create new object in every time

    }
}