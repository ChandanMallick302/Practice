package com.springorm;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.springorm.Spring_Hibernate_Configuration.By_Annotation_Based.Config;


/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// Spring Hibernate Configuration By Xml based
//		try {
//			ApplicationContext context = new ClassPathXmlApplicationContext(
//					"com/springorm/Spring_Hibernate_Configuration/By_XML_Based/config.xml");
//			HibernateTemplate temp = context.getBean("template", HibernateTemplate.class);
//			Session session = temp.getSessionFactory().openSession();
//			if(session.isConnected()) {
//				System.out.println("Connection Established");
//			}else {
//				System.out.println("Connection Lost!!!");
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}

		// Spring hibernate Configuration By Annotation based
			ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
			HibernateTemplate temp = context1.getBean("temp", HibernateTemplate.class);
			Session session = temp.getSessionFactory().openSession();
			if (session.isConnected()) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connection Lost!!!");
			}
	}
}