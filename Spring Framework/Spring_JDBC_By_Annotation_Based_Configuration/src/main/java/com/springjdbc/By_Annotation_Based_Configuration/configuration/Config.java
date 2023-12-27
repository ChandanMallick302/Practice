package com.springjdbc.By_Annotation_Based_Configuration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	@Bean
	public DriverManagerDataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/springjdbc";
		String username = "root";
		String password = "root";
		DriverManagerDataSource datasource = new DriverManagerDataSource(url, username, password);
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
	}

	@Bean({ "jdbc", "jdbcTemplate" })
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbc = new JdbcTemplate();
		jdbc.setDataSource(getDataSource());
		return jdbc;
	}

}
