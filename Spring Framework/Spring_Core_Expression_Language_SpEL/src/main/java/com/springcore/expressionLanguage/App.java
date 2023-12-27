package com.springcore.expressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.expressionLanguage.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/expressionLanguage/configuration/config.xml");
    	Student student = context.getBean("s1",Student.class);
    	
    	//	Arithmetic operator in spring expression language
    	System.out.println("Sum : "+student.sum);
    	System.out.println("Sub : "+student.sub);
    	System.out.println("Mul : "+student.mul);
    	System.out.println("Div : "+student.div);
    	System.out.println("Mod : "+student.mod);
    	
//    	Relational operator in spring expression language
    	System.out.println("equal : "+student.equal);
    	
    	
    	//Logical operator in spring expression language
    	System.out.println("AND : "+student.and);
    	System.out.println("Not : "+student.not);
    	
    	//Conditional operator in spring expression language
    	System.out.println("Conditional : "+student.conditional);
    	
    	//Use java predefined class
    	System.out.println("squre root of 144 : "+student.findSquareRoot);
    	
    	//Find the value of PI
    	System.out.println("Vlaue of PI : "+student.valueOfPI);   
    	
    	//Use userDefined Class method
    	System.out.println("User-defined Method : "+student.userMethod);
    	
    	// By use SpelExpression Class
    	SpelExpressionParser parser= new SpelExpressionParser();
    	Expression expression = parser.parseExpression("'Hello World !!'");
    	System.out.println(expression.getValue());
    	
    }
}