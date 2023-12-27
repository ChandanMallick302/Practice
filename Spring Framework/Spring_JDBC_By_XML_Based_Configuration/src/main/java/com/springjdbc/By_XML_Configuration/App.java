package com.springjdbc.By_XML_Configuration;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springjdbc/By_XML_Configuration/configuration/config.xml");
		JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
		try {
			Connection con = jd.getDataSource().getConnection();

			if (con.isClosed()) {
				System.out.println("connection closed");
			} else {
				System.out.println("Database Connection done!!");
			}
//			String sql1="Create table Student (id int not null,name varchar(200) null,address varchar(200) null, primary key(id))";
//			int i = jd.update(sql1);
//			System.out.println("Sucessfully "+i+" Table Created");
			
			String sql2="insert into Student (id, name, address) values (?,?,?)";
			int insert = jd.update(sql2,2,"Chandan","India");
			System.out.println("Successfully "+insert+" data inserted!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}