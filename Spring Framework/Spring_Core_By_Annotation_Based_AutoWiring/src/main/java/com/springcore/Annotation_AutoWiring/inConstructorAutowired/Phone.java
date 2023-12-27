package com.springcore.Annotation_AutoWiring.inConstructorAutowired;

import java.util.Set;

public class Phone {

	private Set<Integer> phone;

	public Phone(Set<Integer> phone) {
		super();
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Phone [phone=" + phone + "]";
	}
}
