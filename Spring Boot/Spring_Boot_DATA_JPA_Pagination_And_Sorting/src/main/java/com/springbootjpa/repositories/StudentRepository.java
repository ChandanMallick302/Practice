package com.springbootjpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
