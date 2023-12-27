package com.springbootjpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootjpa.entities.Address;
import com.springbootjpa.entities.Employee;
import com.springbootjpa.entities.Mobile;
import com.springbootjpa.repositories.AddressRepository;
import com.springbootjpa.repositories.EmployeeRepository;
import com.springbootjpa.repositories.MobileRepository;

@SpringBootApplication
public class SpringBootDATAJPARelationshipMappingOneToManyAndManyToOneApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository empRepository;

	@Autowired
	private MobileRepository mobileRepository;

	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDATAJPARelationshipMappingOneToManyAndManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee e1=new Employee();
//		e1.setName("Chandan");
//		
//		Employee e2=new Employee();
//		e2.setName("Rajesh");
//		
//		Address a1=new Address();
//		a1.setAddress("Balasore");
//		a1.setAddressType("Current address");
//		
//		Address a2=new Address();
//		a2.setAddress("Soro");
//		a2.setAddressType("Parmanent address");
//		
//		Address a3=new Address();
//		a3.setAddress("Cuttack");
//		a3.setAddressType("Current address");
//		
//		Address a4=new Address();
//		a4.setAddress("Niali");
//		a4.setAddressType("Parmanent address");
//		
//		List<Address> addList1=Arrays.asList(a1,a2);
//		List<Address> addList2=Arrays.asList(a3,a4);
//		
//		e1.setAddress(addList1);
//		e2.setAddress(addList2);
//		
//		a1.setEmp(e1);
//		a2.setEmp(e1);
//		a3.setEmp(e2);
//		a4.setEmp(e2);
//		
//		List<Employee> emplist=Arrays.asList(e1,e2);
//		empRepository.saveAll(emplist);
//		System.out.println("sucessfully saved");

		// selectByEmployee
		List<Employee> findAll = empRepository.findAll();
		findAll.forEach(e -> {
			System.out.println(e.getName());
			System.out.println(e.getMob().getPhoneNumber());
			e.getAddress().forEach(x -> {
				System.out.println(x.getAddress());
				System.out.println(x.getAddressType());
			});
		});

		// selectByMobile
		List<Mobile> findAll2 = mobileRepository.findAll();
		findAll2.forEach(e -> {
			System.out.println(e.getBrand());
			System.out.println(e.getEmp().getName());
		});

		// selectByAddress
		List<Address> findAll3 = addressRepository.findAll();
		findAll3.forEach(e -> {
			System.out.println(e.getAddress());
			System.out.println(e.getAddressType());
			System.out.println(e.getEmp().getName());
			System.out.println(e.getEmp().getMob().getBrand());
			System.out.println(e.getEmp().getMob().getPhoneNumber());
		});
	}
}