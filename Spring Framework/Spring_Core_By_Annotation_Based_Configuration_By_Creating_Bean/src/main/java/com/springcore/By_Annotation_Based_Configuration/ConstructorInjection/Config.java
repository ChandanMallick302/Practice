package com.springcore.By_Annotation_Based_Configuration.ConstructorInjection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	public Address getAddress() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("city", "Balasore");
		m.put("State", "Odisha");
		return new Address(m);
	}

	@Bean(name = { "emp", "employee" })
	public Employee getEmployee() {

		return new Employee(1, "Rajesh", getAddress());
	}
}