package com.springorm.Spring_Hibernate_CRUD_Operation.By_Annotation_Based;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

public class StudentDaoImpl1 implements StudentDao1 {

	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	@Override
	@Transactional
	public int insert(Student1 st) {
		int i=(int) ht.save(st);
		return i;
	}

	@Override
	@Transactional
	public boolean update(Student1 student) {
		boolean f=false;
		ht.saveOrUpdate(student);
		f=true;
		return f;
	}
	
	@Override
	@Transactional
	public boolean delete(int id) {
		boolean f=false;
		Student1 student = ht.get(Student1.class, id);
		ht.delete(student);
		f=true;
		return f;
	}

	@Override
	public Student1 selectStudentById(int id) {
		Student1 student = ht.get(Student1.class, id);
		return student;
	}

	@Override
	public List<Student1> selectAllStudent() {
		List<Student1> loadAll = ht.loadAll(Student1.class);
		return loadAll;
	}

	
}
