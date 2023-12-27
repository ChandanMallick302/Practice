package com.springcore.SterotypeAnnotation.entity;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {

	@Value("#{add}")
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
