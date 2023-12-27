package com.springcore.Bean_Life_Cycle.By_Implementing_Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean,DisposableBean {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy object");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization object");
		
	}
	
}
