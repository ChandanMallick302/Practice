package com.springorm.Spring_Hibernate_CRUD_Operation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.Spring_Hibernate_CRUD_Operation.By_Annotation_Based.Config;
import com.springorm.Spring_Hibernate_CRUD_Operation.By_Annotation_Based.Student1;
import com.springorm.Spring_Hibernate_CRUD_Operation.By_Annotation_Based.StudentDao1;
import com.springorm.Spring_Hibernate_CRUD_Operation.By_XML_Based.Student;
import com.springorm.Spring_Hibernate_CRUD_Operation.By_XML_Based.StudentDao;
import com.springorm.Spring_Hibernate_CRUD_Operation.By_XML_Based.StudentDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	//Spring Hibernate CRUD Operation By XML based
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/Spring_Hibernate_CRUD_Operation/By_XML_Based/config.xml");
//    	StudentDao dao = context.getBean("studentdDaoImpl",StudentDao.class);
//        
//    	
//    	//Insert
////    	Student s1=new Student();
////    	s1.setId(6);
////    	s1.setName("Rohit");
////    	s1.setCourse("PHP");
////    	
////    	int i = dao.insert(s1);
////    	if(i>0) {
////			System.out.println("Sucessfully "+i+" data inserted");
////		}
//    	
//    	//Update
////    	Student s2=new Student();
////    	s2.setId(4);
////    	s2.setName("Rajesh");
////    	s2.setCourse("Java");
////    	boolean update = dao.update(s2);
////    	if(update) {
////    		System.out.println("Update is successfull");
////    	}
//    	
//    	//delete
////    	boolean delete = dao.delete(4);
////    	if(delete) {
////    		System.out.println("Sucessfully deleted");
////    	}
//    	
//    	//selectById
//    	Student studentById = dao.selectStudentById(5);
//    	System.out.println(studentById);
//    	
//    	//selectedAll Student
//    	List<Student> allStudent = dao.selectAllStudent();
//    	System.out.println(allStudent);
    	
//Spring Hibernate CRUD Operation By Annotation based
    	
    	ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
    	StudentDao1 dao1 = context1.getBean("studentdaoImpl",StudentDao1.class);
        
    	
//    	Insert
//    	Student1 s1=new Student1();
//    	s1.setId(6);
//    	s1.setName("Rohit");
//    	s1.setCourse("PHP");
//    	
//    	int i = dao1.insert(s1);
//    	if(i>0) {
//			System.out.println("Sucessfully "+i+" data inserted");
//		}
    	
    	//Update
//    	Student1 s2=new Student1();
//    	s2.setId(4);
//    	s2.setName("Rajesh");
//    	s2.setCourse("Java");
//    	boolean update = dao1.update(s2);
//    	if(update) {
//    		System.out.println("Update is successfull");
//    	}
    	
    	//delete
//    	boolean delete = dao1.delete(4);
//    	if(delete) {
//    		System.out.println("Sucessfully deleted");
//    	}
    	
    	//selectById
    	Student1 studentById = dao1.selectStudentById(5);
    	System.out.println(studentById);
    	
    	//selectedAll Student
    	List<Student1> allStudent = dao1.selectAllStudent();
    	System.out.println(allStudent);
    }
}
