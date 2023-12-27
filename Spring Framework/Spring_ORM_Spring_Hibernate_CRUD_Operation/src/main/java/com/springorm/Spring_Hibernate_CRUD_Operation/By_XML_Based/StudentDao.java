package com.springorm.Spring_Hibernate_CRUD_Operation.By_XML_Based;

import java.util.List;

public interface StudentDao {

	public abstract int insert(Student st);

	public abstract boolean update(Student student);

	public abstract boolean delete(int id);

	public abstract Student selectStudentById(int id);

	public abstract List<Student> selectAllStudent();

}