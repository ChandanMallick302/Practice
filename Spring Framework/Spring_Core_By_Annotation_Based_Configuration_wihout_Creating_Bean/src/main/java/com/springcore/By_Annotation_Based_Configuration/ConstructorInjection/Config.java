package com.springcore.By_Annotation_Based_Configuration.ConstructorInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.By_Annotation_Based_Configuration.ConstructorInjection")
public class Config {
	
	public Employee getEmployee() {
		return new Employee(new Address());
	}
	
}