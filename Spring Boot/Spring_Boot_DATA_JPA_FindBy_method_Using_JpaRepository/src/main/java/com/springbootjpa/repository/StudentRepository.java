package com.springbootjpa.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	// findByName
	public Student findByName(String name);

	// And
	public List<Student> findByAgeAndAddress(int age, String address);

	// Or
	public List<Student> findByAgeOrAddress(int age, String address);

	// Equals
	public List<Student> findByAgeEquals(int age);

	// Is
	public List<Student> findByNameIs(String name);

	// Between
	public List<Student> findByAgeBetween(int age1,int age2);

	// LessThan
	public List<Student> findByAgeLessThan(int age);

	// LessThanEqual
	public List<Student> findByAgeLessThanEqual(int age);

	// GreaterThan
	public List<Student> findByAgeGreaterThan(int age);

	// GreaterThanEqual
	public List<Student> findByAgeGreaterThanEqual(int age);

	// After
	public List<Student> findByAgeAfter(int age);

	// Before
	public List<Student> findByAgeBefore(int age);

	// IsNull
	public List<Student> findByAddressIsNull();

	// IsNotNull
	public List<Student> findByAddressIsNotNull();

	// Like
	public List<Student> findByNameLike(String name);

	// NotLike
	public List<Student> findByNameNotLike(String name);

	// StartingWith
	public List<Student> findByNameStartingWith(String name);

	// EndingWith
	public List<Student> findByNameEndingWith(String name);

	// Containing
	public List<Student> findByNameContaining(String name);

	// OrderBy...Asc
	public List<Student> findByAgeOrderByNameAsc(int age);
	
	// OrderBy...Desc
	public List<Student> findByAgeOrderByNameDesc(int age);

	// Not
	public List<Student> findByAgeNot(int age);

	// In
	public List<Student> findByAgeIn(List<Integer> ages);

	// NotIn
	public List<Student> findByAgeNotIn(Collection<Integer> ages);

	// True
	public List<Student> findByActiveTrue();

	// false
	public List<Student> findByActiveFalse();
	
	// IgnoreCase
	public List<Student> findByNameIgnoreCase(String name);
	
	//existBy
	public boolean existsByNameIgnoreCase(String name);
}
