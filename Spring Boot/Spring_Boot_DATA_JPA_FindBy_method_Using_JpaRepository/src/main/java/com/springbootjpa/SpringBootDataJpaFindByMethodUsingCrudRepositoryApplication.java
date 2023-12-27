package com.springbootjpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springbootjpa.entity.Student;
import com.springbootjpa.repository.StudentRepository;

@SpringBootApplication
public class SpringBootDataJpaFindByMethodUsingCrudRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaFindByMethodUsingCrudRepositoryApplication.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		//findByName
		Student findByName = repository.findByName("Rajesh");
		System.out.println(findByName);
		
		//And
		List<Student> findByAgeAndAddress = repository.findByAgeAndAddress(28, "Europe");
		findByAgeAndAddress.forEach(e->{System.out.println(e);});
		
		//Or
		List<Student> findByAgeOrAddress = repository.findByAgeOrAddress(28, "USSR");
		findByAgeOrAddress.forEach(e->{System.out.println(e);});
		
		//Equals
		List<Student> findByAgeEquals=repository.findByAgeEquals(28);
		findByAgeEquals.forEach(e->{System.out.println(e);});
		
		//Is
		List<Student> findByNameIs = repository.findByNameIs("Chandan");
		findByNameIs.forEach(e->{System.out.println(e);});
		
		//Between
		List<Student> findByAgeBetween = repository.findByAgeBetween(20, 30);
		findByAgeBetween.forEach(e->{System.out.println(e);});
		
		//LessThan
		List<Student> findByAgeLessThan = repository.findByAgeLessThan(25);
		findByAgeLessThan.forEach(e->{System.out.println(e);});
		
		//LessThanEqual
		List<Student> findByAgeLessThanEqual = repository.findByAgeLessThanEqual(27);
		findByAgeLessThanEqual.forEach(e->{System.out.println(e);});
		
		//GreaterThan
		List<Student> findByAgeGreaterThan = repository.findByAgeGreaterThan(27);
		findByAgeGreaterThan.forEach(e->{System.out.println(e);});
		
		//GreaterThanEqual
		List<Student> findByAgeGreaterThanEqual = repository.findByAgeGreaterThanEqual(27);
		findByAgeGreaterThanEqual.forEach(e->{System.out.println(e);});
		
		//After
		List<Student> findByAgeAfter = repository.findByAgeAfter(27);
		findByAgeAfter.forEach(e->{System.out.println(e);});
		
		//Before
		List<Student> findByAgeBefore = repository.findByAgeBefore(27);
		findByAgeBefore.forEach(e->{System.out.println(e);});
		
		//IsNull
		List<Student> findByAddressIsNull = repository.findByAddressIsNull();
		findByAddressIsNull.forEach(e->{System.out.println(e);});
		
		//IsNotNull
		List<Student> findByAddressIsNotNull = repository.findByAddressIsNotNull();
		findByAddressIsNotNull.forEach(e->{System.out.println(e);});
		
		//Like
		List<Student> findByNameLike = repository.findByNameLike("chandan");
		findByNameLike.forEach(e->{System.out.println(e);});
		
		//NotLike
		List<Student> findByNameNotLike = repository.findByNameNotLike("Chandan");
		findByNameNotLike.forEach(e->{System.out.println(e);});
		
		//StartingWith
		List<Student> findByNameStartingWith = repository.findByNameStartingWith("P");
		findByNameStartingWith.forEach(e->{System.out.println(e);});
		
		//EndingWith
		List<Student> findByNameEndingWith = repository.findByNameEndingWith("P");
		findByNameEndingWith.forEach(e->{System.out.println(e);});
		
		//Containing
		List<Student> findByNameContaing = repository.findByNameEndingWith("sh");
		findByNameContaing.forEach(e->{System.out.println(e);});
		
		//OrderBy...Asc
		List<Student> findByAgeOrderByNameAsc = repository.findByAgeOrderByNameAsc(24);
		findByAgeOrderByNameAsc.forEach(e->{System.out.println(e);});
		
		//OrderBy...Desc
		List<Student> findByAgeOrderByNameDesc = repository.findByAgeOrderByNameDesc(24);
		findByAgeOrderByNameDesc.forEach(e->{System.out.println(e);});
		
		//Not
		List<Student> findByAgeNot = repository.findByAgeNot(24);
		findByAgeNot.forEach(e->{System.out.println(e);});
		
		//In
		List<Integer> ages=Arrays.asList(24,27);
		List<Student> findByAgeIn = repository.findByAgeIn(ages);
		findByAgeIn.forEach(e->{System.out.println(e);});
		
		//NotIn
		List<Integer> ages1=Arrays.asList(24,27);
		List<Student> findByAgeNotIn = repository.findByAgeNotIn(ages1);
		findByAgeNotIn.forEach(e->{System.out.println(e);});
		
		//True
		List<Student> findByActiveTrue = repository.findByActiveTrue();
		findByActiveTrue.forEach(e->{System.out.println(e);});
		
		//false
		List<Student> findByActiveFalse = repository.findByActiveFalse();
		findByActiveFalse.forEach(e->{System.out.println(e);});
		
		//IgnoreCase
		List<Student> findByNameIgnoreCase = repository.findByNameIgnoreCase("chandan");
		findByNameIgnoreCase.forEach(e->{System.out.println(e);});
		
		//existsByName
		boolean existsByName = repository.existsByNameIgnoreCase("chandan");
		System.out.println(existsByName);
	}

}
