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

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbcTemplate = context.getBean("jdbc", JdbcTemplate.class);
		Connection con = jdbcTemplate.getDataSource().getConnection();

		if (con.isClosed()) {
			System.out.println("Connection Closed");
		} else {
			System.out.println("Connection Successfully establshed");
		}

//		Insert
//		String sql1 = "insert into Student (id,name,address) values (?,?,?)";
//		int insert = jdbcTemplate.update(sql1, 3, "Ramesh", "USA");
//		System.out.println("Sucessfully " + insert + " Data inserted");

//		Update
//		String sql2="update student set name=?, address=? where id=?";
//		int update = jdbcTemplate.update(sql2,"Paresh","China",2);
//		System.out.println("Sucessfully " + update + " Data updated");

		// Delete
//		String sql3 = "delete from student where id=?";
//		int delete = jdbcTemplate.update(sql3, 3);
//		System.out.println("Sucessfully " + delete + " Data deleted");

		// Select Specific By id
//		String sql4 = "Select * from student where id=?";
//		RowMapper rowMapper=new RowMapper() {
//
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				String address = rs.getString(3);
//				
//				return name;
//			}
//			
//		};
//		
//		String name = jdbcTemplate.queryForObject(sql4,rowMapper,2);
//		
//		System.out.println(name);
		
		//SelectAll Using Stream and List
		String sql5 = "Select * from student";
		RowMapper rowMapper1=new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				Stream stream = Stream.of(id,name,address);
				List<String> list = (List<String>) stream.collect(Collectors.toList());
				return list;
			}
		};
		 List selectAll = jdbcTemplate.query(sql5,rowMapper1);
		 selectAll.forEach(e->{System.out.println(e);});
		
		}
	
}
