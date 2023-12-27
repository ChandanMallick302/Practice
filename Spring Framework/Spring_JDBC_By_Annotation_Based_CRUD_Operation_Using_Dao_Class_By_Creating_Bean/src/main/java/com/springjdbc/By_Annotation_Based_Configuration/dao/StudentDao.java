package com.springjdbc.By_Annotation_Based_Configuration.dao;

import java.util.List;

import com.springjdbc.By_Annotation_Based_Configuration.model.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int updateDetails(Student student);
	
	public int delete(int id);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudents();

	
}