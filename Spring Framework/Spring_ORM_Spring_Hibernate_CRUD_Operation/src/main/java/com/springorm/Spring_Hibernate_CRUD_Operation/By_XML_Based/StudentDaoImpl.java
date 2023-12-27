package com.springorm.Spring_Hibernate_CRUD_Operation.By_XML_Based;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	@Transactional
	@Override
	public int insert(Student st) {
		int i=(int) ht.save(st);
		return i;
	}

	@Transactional
	@Override
	public boolean update(Student student) {
		boolean f=false;
		ht.saveOrUpdate(student);
		f=true;
		return f;
	}
	@Transactional
	@Override
	public boolean delete(int id) {
		boolean f=false;
		Student student = ht.get(Student.class, id);
		ht.delete(student);
		f=true;
		return f;
	}

	@Override
	public Student selectStudentById(int id) {
		Student student = ht.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> selectAllStudent() {
		List<Student> loadAll = ht.loadAll(Student.class);
		return loadAll;
	}

	
}
