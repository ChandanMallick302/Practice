package com.springbootjpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootjpa.entities.Employee;
import com.springbootjpa.entities.Mobile;
import com.springbootjpa.repositories.EmployeeRepository;
import com.springbootjpa.repositories.MobileRepository;

@SpringBootApplication
public class SpringBootJpaRelationshipMappingOneToOneApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository empRepository;

	@Autowired
	private MobileRepository mobileRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaRelationshipMappingOneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1=new Employee();
		e1.setName("Chandan");
		
		Employee e2=new Employee();
		e2.setName("Rajesh");
		
		Mobile m1=new Mobile();
		m1.setBrand("Red Me");
		m1.setPhoneNumber(7008045937L);
		
		Mobile m2=new Mobile();
		m2.setBrand("Samsung");
		m2.setPhoneNumber(9938316540L);
		
		e1.setMob(m1);
		e2.setMob(m2);
		
		m1.setEmp(e1);
		m2.setEmp(e2);
		
		List<Employee> emplist=Arrays.asList(e1,e2);
		empRepository.saveAll(emplist);
		System.out.println("sucessfully saved");

//		// selectByEmployee
//		List<Employee> findAll = empRepository.findAll();
//		findAll.forEach(e -> {
//			System.out.println(e.getName());
//			System.out.println(e.getMob().getPhoneNumber());
//		});
//
//		// selectByEmployee
//		List<Mobile> findAll2 = mobileRepository.findAll();
//		findAll2.forEach(e -> {
//			System.out.println(e.getBrand());
//			System.out.println(e.getEmp().getName());
//		});

	}

}
