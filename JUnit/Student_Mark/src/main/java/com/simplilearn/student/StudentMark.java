package com.simplilearn.student;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		// Declaring and initializing variables
		Scanner sc = new Scanner(System.in);
		float physics_marks, chemistry_marks, maths_marks;

		System.out.println("Enter Physics marks out of 100? ");
		physics_marks = sc.nextFloat();
		System.out.println("Enter Chemistry marks out of 100? ");
		chemistry_marks = sc.nextFloat();
		System.out.println("Enter Math marks out of 100? ");
		maths_marks = sc.nextFloat();

		//getting total marks here
		float total_marks = getTotalMarks(physics_marks, chemistry_marks, maths_marks);
		System.out.println("Total marks of the student out of 300 is: "+total_marks);
		
		//getting total marks in percentage here
		float percentage=getPercentage(physics_marks, chemistry_marks, maths_marks);
		System.out.println("Percentage of marks is obtained is: "+String.format("%.2f",percentage));
		
		//getting Grade here
		String grade=getGrade(percentage);
		System.out.println("Grade of the student is: "+grade);
	}

	public static String getGrade(float percentage) {
		//Throwing error if percentage is not in range of 0 to 100
		if(percentage>100||percentage<0) {
			throw new ArithmeticException("Invalid percentage Error");
		}
		// Method to Calculate Grade
		if(percentage>=80) {
			return "A+";
		}
		else if(percentage>=60 && percentage<=79) {
			return "A";
		}
		else if(percentage>=50&& percentage<=59) {
			return "B";
		}
		else {
			return "C";
		}
	}

	public static float getPercentage(float physics_marks, float chemistry_marks, float maths_marks) {
		//method to calculate percentage
		//Throwing an exception when marks is not in range of 0 to 100
		if(physics_marks>100||chemistry_marks>100||maths_marks>100) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		else if(physics_marks<0||chemistry_marks<0||maths_marks<0) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		float total_percentage=((physics_marks+chemistry_marks+maths_marks)/300)*100;
		return total_percentage;
	}

	public static float getTotalMarks(float physics_marks, float chemistry_marks, float maths_marks) {
		// method to calculate total marks
		//Throwing an exception when marks is not in range of 0 to 100
		if(physics_marks>100||chemistry_marks>100||maths_marks>100) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		else if(physics_marks<0||chemistry_marks<0||maths_marks<0) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		float total_marks = physics_marks + chemistry_marks + maths_marks;
		return total_marks;
	}
}