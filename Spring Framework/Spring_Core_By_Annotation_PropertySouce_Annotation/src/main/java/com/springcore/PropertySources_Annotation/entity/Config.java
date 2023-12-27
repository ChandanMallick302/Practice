package com.springcore.PropertySources_Annotation.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.springcore.PropertySources_Annotation.entity")
@PropertySources({ @PropertySource("classpath:com/springcore/PropertySource_Annotation/File/student.properties"),
		@PropertySource("classpath:com/springcore/PropertySource_Annotation/File/address.properties") })
public class Config {

}