package com.springcore.PropertySource_Annotation.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springcore.PropertySource_Annotation.entity")
@PropertySource(value ="classpath:com/springcore/PropertySource_Annotation/File/student.properties")
public class Config {
	
}