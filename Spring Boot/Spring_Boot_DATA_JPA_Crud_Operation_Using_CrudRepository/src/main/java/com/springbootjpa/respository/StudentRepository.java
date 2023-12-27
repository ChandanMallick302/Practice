package com.springbootjpa.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
