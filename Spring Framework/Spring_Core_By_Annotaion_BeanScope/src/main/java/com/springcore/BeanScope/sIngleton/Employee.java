package com.springcore.BeanScope.sIngleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("singleton")
public class Employee {

	@Value("1")
	private int id;

	@Value("Chandan")
	private String name;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}