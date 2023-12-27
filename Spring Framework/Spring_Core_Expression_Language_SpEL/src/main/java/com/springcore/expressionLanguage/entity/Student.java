package com.springcore.expressionLanguage.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

//	Arithmatic operator in spring expression language
	@Value("#{1+2}")
	public int sum;
	@Value("#{2-3}")
	public int sub;
	@Value("#{5*2}")
	public int mul;
	@Value("#{10 div 2}")
	public int div;
	@Value("#{10 mod 2}")
	public int mod;
	
//	Relational operator in spring expression language
	@Value("#{3>2}")
	public boolean gratorthan;
	@Value("#{3<2}")
	public boolean lessthan;
	@Value("#{3==3}")
	public boolean equal;
	@Value("#{3!=2}")
	public boolean notequal;
	@Value("#{3<=2}")
	public boolean lessthanEqual;
	@Value("#{3>=2}")
	public boolean gratorthanEqual;
	@Value("#{3 lt 2}")
	public boolean lessThan;
	@Value("#{3 gt 2}")
	public boolean gratorThan;
	@Value("#{3 eq 3}")
	public boolean Equal;
	@Value("#{3 ne 2}")
	public boolean notEqual;
	@Value("#{3 le 2}")
	public boolean lessThanEqual;
	@Value("#{3 ge 2}")
	public boolean 	gratorThanEqual;
	
	//Logical operator in spring expression language
	@Value("#{(3==2) and (2<3)}")
	public boolean and;
	@Value("#{(3>4) or (6<4)}")
	public boolean or;
	@Value("#{(3==3) && (2<5)}")
	public boolean and_;
	@Value("#{(3==3) || (3<3)}")
	public boolean or_;
	@Value("#{!true}")
	public boolean not;
	
	//Conditional operator in spring expression language
	@Value("#{(3>2)? 'Go': 'Not Go'}")
	public String conditional;
	
	//Find square root Use java predefined class
	@Value("#{T(java.lang.Math).sqrt(144)}")
	public int findSquareRoot;
	
	//Find the value of PI
	@Value("#{T(java.lang.Math).PI}")
	public int valueOfPI;
	
	//Use userDefined Class method
	@SuppressWarnings("unused")
	public static String call() {
		return "User Method is calling";
	}
	@Value("#{T(com.springcore.expressionLanguage.entity.Student).call()}")
	public String userMethod;
}
