package com.spring.Spring_IOC_Cointainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_IOC_Cointainer.entity.Ram;
import com.spring.Spring_IOC_Cointainer.entity.Shyam;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/Spring_IOC_Cointainer/configByXml/config.xml");
		
		System.out.println(context);// to check whether Ram object is created or not
		
		Ram ram = context.getBean("person1",Ram.class);
		ram.eat();
		ram.run();
		
		Shyam shyam = context.getBean("person2", Shyam.class);
		shyam.eat();
		shyam.sleep();
		
	}
}
