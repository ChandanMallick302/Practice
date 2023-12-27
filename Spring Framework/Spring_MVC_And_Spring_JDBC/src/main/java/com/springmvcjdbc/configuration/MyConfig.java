package com.springmvcjdbc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.springmvcjdbc")
public class MyConfig {

	//View Resolver Configuration for MVC
	@Bean("viewResolver")
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	// Configuration for JDBC
	@Bean("datasource")
	public DriverManagerDataSource getDataSource() {
		String url="jdbc:mysql://localhost:3306/springmvcjdbc";
		String username="root";
		String password="root";
		DriverManagerDataSource datasource=new DriverManagerDataSource(url,username,password);
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJDBCTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	

}
