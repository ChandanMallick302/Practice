package com.springbootjpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.springbootjpa.entity.Student;
import com.springbootjpa.repository.StudentRepository;

@SpringBootApplication
public class SpringBootDataJpagetfindByMethodUsingCrudRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpagetfindByMethodUsingCrudRepositoryApplication.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		//getStudentByName
		Student getStudentName = repository.getStudentByName("Rajesh");
		System.out.println(getStudentName);
		
		//And
		List<Student> getStudentByAgeAndAddress = repository.getStudentByAgeAndAddress(24, "Europe");
		getStudentByAgeAndAddress.forEach(e->{System.out.println(e);});
		
		//Or
		List<Student> getStudentByAgeOrAddress = repository.getStudentByAgeOrAddress(28, "USSR");
		getStudentByAgeOrAddress.forEach(e->{System.out.println(e);});
		
		//Equals
		List<Student> getStudentByAgeEquals=repository.getStudentByAgeEquals(28);
		getStudentByAgeEquals.forEach(e->{System.out.println(e);});
		
		//Is
		List<Student> getStudentByNameIs = repository.getStudentByNameIs("Chandan");
		getStudentByNameIs.forEach(e->{System.out.println(e);});
		
		//Between
		List<Student> getStudentByAgeBetween = repository.getStudentByAgeBetween(20, 30);
		getStudentByAgeBetween.forEach(e->{System.out.println(e);});
		
		//LessThan
		List<Student> getStudentByAgeLessThan = repository.getStudentByAgeLessThan(25);
		getStudentByAgeLessThan.forEach(e->{System.out.println(e);});
		
		//LessThanEqual
		List<Student> getStudentByAgeLessThanEqual = repository.getStudentByAgeLessThanEqual(27);
		getStudentByAgeLessThanEqual.forEach(e->{System.out.println(e);});
		
		//GreaterThan
		List<Student> getStudentByAgeGreaterThan = repository.getStudentByAgeGreaterThan(27);
		getStudentByAgeGreaterThan.forEach(e->{System.out.println(e);});
		
		//GreaterThanEqual
		List<Student> getStudentByAgeGreaterThanEqual = repository.getStudentByAgeGreaterThanEqual(27);
		getStudentByAgeGreaterThanEqual.forEach(e->{System.out.println(e);});
		
		//After
		List<Student> getStudentByAgeAfter = repository.getStudentByAgeAfter(27);
		getStudentByAgeAfter.forEach(e->{System.out.println(e);});
		
		//Before
		List<Student> getStudentByAgeBefore = repository.getStudentByAgeBefore(27);
		getStudentByAgeBefore.forEach(e->{System.out.println(e);});
		
		//IsNull
		List<Student> getStudentByAddressIsNull = repository.getStudentByAddressIsNull();
		getStudentByAddressIsNull.forEach(e->{System.out.println(e);});
		
		//IsNotNull
		List<Student> getStudentByAddressIsNotNull = repository.getStudentByAddressIsNotNull();
		getStudentByAddressIsNotNull.forEach(e->{System.out.println(e);});
		
		//Like
		List<Student> getStudentByNameLike = repository.getStudentByNameLike("chandan");
		getStudentByNameLike.forEach(e->{System.out.println(e);});
		
		//NotLike
		List<Student> getStudentByNameNotLike = repository.getStudentByNameNotLike("Chandan");
		getStudentByNameNotLike.forEach(e->{System.out.println(e);});
		
		//StartingWith
		List<Student> getStudentByNameStartingWith = repository.getStudentByNameStartingWith("P");
		getStudentByNameStartingWith.forEach(e->{System.out.println(e);});
		
		//EndingWith
		List<Student> getStudentByNameEndingWith = repository.getStudentByNameEndingWith("l");
		getStudentByNameEndingWith.forEach(e->{System.out.println(e);});
		
		//Containing
		List<Student> getStudentByNameContaing = repository.getStudentByNameContaining("sh");
		getStudentByNameContaing.forEach(e->{System.out.println(e);});
		
		//OrderBy...Asc
		List<Student> getStudentByAgeOrderByNameAsc = repository.getStudentByAgeOrderByNameAsc(24);
		getStudentByAgeOrderByNameAsc.forEach(e->{System.out.println(e);});
		
		//OrderBy...Desc
		List<Student> getStudentByAgeOrderByNameDesc = repository.getStudentByAgeOrderByNameDesc(24);
		getStudentByAgeOrderByNameDesc.forEach(e->{System.out.println(e);});
		
		//Not
		List<Student> getStudentByAgeNot = repository.getStudentByAgeNot(24);
		getStudentByAgeNot.forEach(e->{System.out.println(e);});
		
		//In
		List<Integer> ages=Arrays.asList(24,27);
		List<Student> getStudentByAgeIn = repository.getStudentByAgeIn(ages);
		getStudentByAgeIn.forEach(e->{System.out.println(e);});
		
		//NotIn
		List<Integer> ages1=Arrays.asList(24,27);
		List<Student> getStudentByAgeNotIn = repository.getStudentByAgeNotIn(ages1);
		getStudentByAgeNotIn.forEach(e->{System.out.println(e);});
		
		//True
		List<Student> getStudentByActiveTrue = repository.getStudentByActiveTrue();
		getStudentByActiveTrue.forEach(e->{System.out.println(e);});
		
		//false
		List<Student> getStudentByActiveFalse = repository.getStudentByActiveFalse();
		getStudentByActiveFalse.forEach(e->{System.out.println(e);});
		
		//IgnoreCase
		List<Student> getStudentByNameIgnoreCase = repository.getStudentByNameIgnoreCase("chandan");
		getStudentByNameIgnoreCase.forEach(e->{System.out.println(e);});
		
		//existsByName
		boolean existsByName = repository.existsByNameIgnoreCase("rohit");
		System.out.println(existsByName);
		
		//Using Named Parameters
		Student selectName = repository.selectName("Naresh");
		System.out.println(selectName);
		
		List<Student> selectNameAndAge = repository.selectNameAndAge("Chandan", 28);
		for(Student s:selectNameAndAge) {
			System.out.println(s);
		}
		
		//findByAndSort
		List<Student> findByAndSort = repository.findByAndSort(24, Sort.by("name"));
		findByAndSort.forEach(e->{System.out.println(e);});
		
		//Custom Query
		List<Student> selectAllByNativeQuery = repository.selectAllByNativeQuery();
		selectAllByNativeQuery.forEach(e->{System.out.println(e);});
		
		List<Student> selectNameAndAgeNativeQuery = repository.selectNameAndAgeNativeQuery();
		selectNameAndAgeNativeQuery.forEach(e->{System.out.println(e);});
		
	}

}
