package com.springorm.Spring_Hibernate_Configuration.By_Annotation_Based;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.springorm.Spring_Hibernate_Configuration.By_XML_Based.Student;

@Configuration
public class Config {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		
		String url = "jdbc:mysql://localhost:3306/springorm";
		String username = "root";
		String password = "root";
		DriverManagerDataSource ds = new DriverManagerDataSource(url, username, password);
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		sessionFactory.setDataSource(ds);
		
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		
		sessionFactory.setHibernateProperties(p);
		
		sessionFactory.setAnnotatedClasses(Student.class);
		
		return sessionFactory;
	}
	@Bean("temp")
	public HibernateTemplate transactionManager()throws IOException {
		SessionFactory sf=sessionFactory().getObject();
		return new HibernateTemplate(sf);
	}
}
