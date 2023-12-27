package com.springbootjpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.springbootjpa.entity.Student;
import com.springbootjpa.repositories.StudentRepository;

@SpringBootApplication
public class SpringBootJpaPaginationAndSortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaPaginationAndSortingApplication.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		
		//pagination abd soring
		Sort sort=Sort.by("name").descending();
		Pageable page = PageRequest.of(0, 3,sort);
		
		Page<Student> findAll = repository.findAll(page);
		findAll.forEach(e->{System.out.println(e);});
		
		System.out.println("size: "+findAll.getSize());
		System.out.println("Total Page: "+findAll.getTotalPages());
		System.out.println("Total Element: "+findAll.getTotalElements());
		
		
		//sorting by age
		// ascending is by default
		List<Student> sortByAge = repository.findAll(Sort.by("id").ascending());
		sortByAge.forEach(e->{System.out.println(e);});
		
	}

}
