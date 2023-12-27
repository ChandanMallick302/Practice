package com.springcore.ConstrucorInjection.ReferenceType;

public class Address {

	private String city;
	private String state;
	
	// to set data through address-constructor
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
