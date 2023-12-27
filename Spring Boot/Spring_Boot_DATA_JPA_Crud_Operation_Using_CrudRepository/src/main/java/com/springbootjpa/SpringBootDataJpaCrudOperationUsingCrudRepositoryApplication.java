package com.springbootjpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springbootjpa.entity.Student;
import com.springbootjpa.respository.StudentRepository;

@SpringBootApplication
public class SpringBootDataJpaCrudOperationUsingCrudRepositoryApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaCrudOperationUsingCrudRepositoryApplication.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		//save data
//		Student s1=new Student();
//		s1.setName("Chandan");
//		s1.setAddress("India");
//		
////		repository.save(s1);
//		
//		Student s2=new Student();
//		s2.setName("Rajesh");
//		s2.setAddress("USA");
//		
//		@SuppressWarnings("rawtypes")
//		List list=new ArrayList<>();
//		list.add(s1);
//		list.add(s2);
//		
//		repository.saveAll(list);
//		System.out.println("Sucessfully saved");
//		
		
		
		//read all or select all the data
		
//		System.out.println(repository.count());
//		
//		Iterable<Student> findAll = repository.findAll();
//		findAll.forEach(e->{System.out.println(e);});
//		
//		//read or select the data by id
//		Optional<Student> findById = repository.findById(1);
//		System.out.println(findById.get());
//		
//		//read or select the data by id
//		List<Integer> ids=Arrays.asList(2,3);
//		Iterable<Student> findAllById = repository.findAllById(ids);
//		findAllById.forEach(e->{System.out.println(e);});
		
		
		
		
		//update the data
		
//		Optional<Student> findById2 = repository.findById(1);
//		Student studentId1 = findById2.get();
//		
//		studentId1.setName("Rohit");
//		studentId1.setAddress("Pakistan");
//		
//		Student update = repository.save(studentId1);
//		
//		System.out.println(findById.get().getName()+" is sucessfully fully update to " +update.getName());
		
		
		
		//delete single data
//		int id=1;
//		Student student1 = repository.findById(id).get();
//		repository.deleteById(id);
//		System.out.println(student1.getId()+" "+student1.getName()+" is sucessfully deleted");
		
		
		//delete specified data
//		List<Integer> id2=Arrays.asList(2,3);
//		
//		repository.deleteAllById(id2);
//		System.out.println(id2.get(0)+", "+ id2.get(1)+" are deleted");
		
		
		//delete all data
		
//		repository.deleteAll();
//		System.out.println("successfully all data deleted");
		
	}

}
