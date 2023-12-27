package com.spring.DependecyInjection;

public class AppTest {

	public static void main(String[] args) {
		Injection ij=new Injection(new Dependency());
		ij.deligate();

	}

}
