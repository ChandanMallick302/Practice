package com.springcore.BeanScope.prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t1")
@Scope("prototype")
public class Teacher {

	@Value("2")
	private int id;

	@Value("Rajesh")
	private String name;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}