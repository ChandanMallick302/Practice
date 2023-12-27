package com.springjdbc.By_Annotation_Based_Configuration;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.By_Annotation_Based_Configuration.configuration.Config;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbcTemplate = context.getBean("jdbc", JdbcTemplate.class);
		Connection con = jdbcTemplate.getDataSource().getConnection();

		if (con.isClosed()) {
			System.out.println("Connection Closed");
		} else {
			System.out.println("Connection Successfully establshed");
		}

		String sql = "insert into Student (id,name,address) values (?,?,?)";
		int insert = jdbcTemplate.update(sql, 3, "Ramesh", "USA");
		System.out.println("Sucessfully " + insert + " Data inserted");
	}
}
