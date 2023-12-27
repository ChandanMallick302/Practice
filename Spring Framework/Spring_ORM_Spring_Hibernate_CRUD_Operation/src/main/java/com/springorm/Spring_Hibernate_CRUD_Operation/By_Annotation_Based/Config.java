package com.springorm.Spring_Hibernate_CRUD_Operation.By_Annotation_Based;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class Config {

	@Bean("datasource")
	public DriverManagerDataSource datasource() {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/springorm";
		String username = "root";
		String password = "root";

		DriverManagerDataSource datasource = new DriverManagerDataSource(url, username, password);
		datasource.setDriverClassName(driverClassName);
		return datasource;
	}

	@Bean("factory")
	public LocalSessionFactoryBean factory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(datasource());

		Properties p = new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");

		factory.setHibernateProperties(p);

		factory.setAnnotatedClasses(Student1.class);

		return factory;
	}

	@Bean("template")
	public HibernateTemplate template() {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(factory().getObject());
		return ht;
	}

	@Bean("tansactionManager")
	public HibernateTransactionManager tansactionManager() {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(factory().getObject());
		return htm;
	}

	@Bean("studentdaoImpl")
	public StudentDaoImpl1 studentdaoImpl() {
		StudentDaoImpl1 daoImpl = new StudentDaoImpl1();
		daoImpl.setHt(template());
		return daoImpl;
	}
}