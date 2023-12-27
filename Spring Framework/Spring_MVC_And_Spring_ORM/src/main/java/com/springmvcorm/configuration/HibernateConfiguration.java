package com.springmvcorm.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.springmvcorm.Entity.User;

@Configuration
@ComponentScan(basePackages = "com.springmvcorm")
@EnableTransactionManagement
public class HibernateConfiguration {

	@Bean(name = "datasource")
	public DriverManagerDataSource getDatasource() {
		String url = "jdbc:mysql://localhost:3306/springmvcorm";
		String username = "root";
		String password = "root";
		DriverManagerDataSource datasource = new DriverManagerDataSource(url, username, password);
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
	}

	@Bean("factory")
	public LocalSessionFactoryBean getFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(getDatasource());

		Properties p = new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");

		factory.setHibernateProperties(p);

		factory.setAnnotatedClasses(User.class);

		return factory;
	}

	@Bean(name = "template")
	public HibernateTemplate getTemplate() {
		HibernateTemplate template = new HibernateTemplate();
		template.setSessionFactory(getFactory().getObject());
		return template;
	}

	@Bean(name = "transaction")
	public HibernateTransactionManager getTransaction() {
		HibernateTransactionManager transaction = new HibernateTransactionManager();
		transaction.setSessionFactory(getFactory().getObject());
		return transaction;
	}
}
