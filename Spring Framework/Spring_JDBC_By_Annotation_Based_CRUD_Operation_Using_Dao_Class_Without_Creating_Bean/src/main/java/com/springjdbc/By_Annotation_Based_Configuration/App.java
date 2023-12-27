package com.springjdbc.By_Annotation_Based_Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.By_Annotation_Based_Configuration.configuration.Config;
import com.springjdbc.By_Annotation_Based_Configuration.dao.StudentDaoImpl;
import com.springjdbc.By_Annotation_Based_Configuration.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StudentDaoImpl sdaoimpl = context.getBean("sdao", StudentDaoImpl.class);
		Connection con = sdaoimpl.getJdbcTemplate().getDataSource().getConnection();
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		}
		else {
			System.out.println("Connection established");
			
			//Insert
//			Student s=new Student();
//			s.setId(3);
//			s.setName("XYZ");	
//			s.setAddress("Delhi");
//			
//			int insert = sdaoimpl.insert(s);
			
			
//			//update
//			Student s1=new Student();
//			s1.setId(1);
//			s1.setName("sdsd");
//			s1.setAddress("Mumbai");
//			
//			int updateDetails = sdaoimpl.updateDetails(s1);
//			
//			//delete
//			sdaoimpl.delete(3);
			
			//selectedByID
//			Student studentById = sdaoimpl.getStudentById(2);
//			System.out.println(studentById);
			
			//SelectAll
			List<Student> allStudents = sdaoimpl.getAllStudents();
			allStudents.forEach(e->{System.out.println(e);});
		}
		
		
	}
}
