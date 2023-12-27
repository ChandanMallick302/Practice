package com.springorm.Spring_Hibernate_CRUD_Operation.By_Annotation_Based;

import java.util.List;

public interface StudentDao1 {

	public abstract int insert(Student1 st);

	public abstract boolean update(Student1 student);

	public abstract boolean delete(int id);

	public abstract Student1 selectStudentById(int id);

	public abstract List<Student1> selectAllStudent();

}