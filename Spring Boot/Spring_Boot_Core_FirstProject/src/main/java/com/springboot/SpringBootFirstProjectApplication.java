package com.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.entity.Student;

@SpringBootApplication
public class SpringBootFirstProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootFirstProjectApplication.class, args);
		int count = context.getBeanDefinitionCount();
		System.out.println(count);
		
		
		Student student = context.getBean("s1",Student.class);
		System.out.println(student.student(1, "Chandan"));
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner working");
		
	}

}