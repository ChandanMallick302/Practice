package com.springbootjpa.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	// getStudentByName
	@Query("select s from Student s where s.name=?1")
	public Student getStudentByName(String name);

	// And
	@Query("select s from Student s where s.age=?1 and s.address=?2")
	public List<Student> getStudentByAgeAndAddress(int age, String address);

	// Or
	@Query("select s from Student s where s.age=?1 or s.address=?2")
	public List<Student> getStudentByAgeOrAddress(int age, String address);

	// Equals
	@Query("select s from Student s where s.age=?1")
	public List<Student> getStudentByAgeEquals(int age);

	// Is
	@Query("select s from Student s where s.name=?1")
	public List<Student> getStudentByNameIs(String name);

	// Between
	@Query("select s from Student s where s.age between ?1 and ?2")
	public List<Student> getStudentByAgeBetween(int age1, int age2);

	// LessThan
	@Query("select s from Student s where s.age<?1")
	public List<Student> getStudentByAgeLessThan(int age);

	// LessThanEqual
	@Query("select s from Student s where s.age<=?1")
	public List<Student> getStudentByAgeLessThanEqual(int age);

	// GreaterThan
	@Query("select s from Student s where s.age>=?1")
	public List<Student> getStudentByAgeGreaterThan(int age);

	// GreaterThanEqual
	@Query("select s from Student s where s.age>=?1")
	public List<Student> getStudentByAgeGreaterThanEqual(int age);

	// After
	@Query("select s from Student s where s.age>?1")
	public List<Student> getStudentByAgeAfter(int age);

	// Before
	@Query("select s from Student s where s.age<?1")
	public List<Student> getStudentByAgeBefore(int age);

	// IsNull
	@Query("select s from Student s where s.address is null")
	public List<Student> getStudentByAddressIsNull();

	// IsNot Null
	@Query("select s from Student s where s.address is not null")
	public List<Student> getStudentByAddressIsNotNull();

	// Like
	@Query("select s from Student s where s.name like ?1")
	public List<Student> getStudentByNameLike(String name);

	// NotLike
	@Query("select s from Student s where s.name not like ?1")
	public List<Student> getStudentByNameNotLike(String name);

	// StartingWith
	@Query("select s from Student s where s.name like ?1%")
	public List<Student> getStudentByNameStartingWith(String name);

	// EndingWith
	@Query("select s from Student s where s.name like %?1")
	public List<Student> getStudentByNameEndingWith(String name);

	// Containing
	@Query("select s from Student s where s.name like %?1%")
	public List<Student> getStudentByNameContaining(String name);

	// OrderBy...Asc
	@Query("select s from Student s where s.age=?1 order by s.name asc")
	public List<Student> getStudentByAgeOrderByNameAsc(int age);

	// OrderBy...Desc
	@Query("select s from Student s where s.age=?1 order by s.name desc")
	public List<Student> getStudentByAgeOrderByNameDesc(int age);

	// Not
	@Query("select s from Student s where s.age <>?1")
	public List<Student> getStudentByAgeNot(int age);

	// In
	@Query("select s from Student s where s.age in ?1")
	public List<Student> getStudentByAgeIn(List<Integer> ages);

	// NotIn
	@Query("select s from Student s where s.age not in ?1")
	public List<Student> getStudentByAgeNotIn(Collection<Integer> ages);

	// True
	@Query("select s from Student s where s.active=true")
	public List<Student> getStudentByActiveTrue();

	// false
	@Query("select s from Student s where s.active=false")
	public List<Student> getStudentByActiveFalse();

	// IgnoreCase
	@Query("select s from Student s where UPPER(s.name)=UPPER(?1)")
	public List<Student> getStudentByNameIgnoreCase(String name);

	// existBy
	@Query("select count(s)>0 from Student s where s.name=?1")
	public boolean existsByNameIgnoreCase(String name);

	
	
	// Using Named Parameters
	@Query("select s from Student s where s.name=:name")
	public Student selectName(@Param("name") String name);

	@Query("select s from Student s where s.name=:name and s.age=:age")
	public List<Student> selectNameAndAge(@Param("name") String name, @Param("age") int age);

	
	
	// findByAndSort
	@Query("select s from Student s where s.age like :age")
	public List<Student> findByAndSort(@Param("age") int age, Sort sort);

	
	
	// Native Query
	@Query(value = "select * from Student", nativeQuery = true)
	public List<Student> selectAllByNativeQuery();

	@Query(value = "select * from Student as s where s.name='Chandan' and s.age=28", nativeQuery = true)
	public List<Student> selectNameAndAgeNativeQuery();

}