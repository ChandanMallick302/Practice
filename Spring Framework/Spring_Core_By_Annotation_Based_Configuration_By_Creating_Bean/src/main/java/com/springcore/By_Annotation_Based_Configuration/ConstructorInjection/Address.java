package com.springcore.By_Annotation_Based_Configuration.ConstructorInjection;

import java.util.Map;

public class Address {

	private Map<String, String> address;

	public Address(Map<String, String> address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
	
}
