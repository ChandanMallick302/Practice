package com.springcore.Annotation_AutoWiring.inSetterMethodAutowired;

import java.util.Map;

public class Address {

	private Map<String, String> address;

	public Map<String, String> getAddress() {
		return address;
	}

	public void setAddress(Map<String, String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
}