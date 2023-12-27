package com.spring.DependecyInjection;

public class Injection {

	private Dependency dependency;

	public Injection(Dependency dependency) {
		this.dependency = dependency;
	}
	public void deligate() {
		System.out.println(dependency.doWork());
	}
}
