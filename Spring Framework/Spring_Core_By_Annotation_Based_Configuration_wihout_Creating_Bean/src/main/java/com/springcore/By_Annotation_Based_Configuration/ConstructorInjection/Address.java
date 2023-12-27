package com.springcore.By_Annotation_Based_Configuration.ConstructorInjection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Address {

	@Value("#{{'City': 'soro', 'State': 'Odisha'}}")
	private Map<String, String> address;

	public Address(Map<String, String> address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
