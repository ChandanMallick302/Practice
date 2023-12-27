package abstraction;

import java.util.Scanner;

public class d_Student1 implements c_Interface_Math {
	Scanner sc=new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter two number to perform addition operation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Addition of "+a+" and "+b +" is "+sum);
	}

	@Override
	public void sub() {
		System.out.println("Enter two number to perform Substraction operation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sub=a-b;
		System.out.println("Substraction of "+a+" and "+b +" is "+sub);
		
	}

	@Override
	public void mul() {
		System.out.println("Enter two number to perform multiplication operation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int mul=a*b;
		System.out.println("Multiplication of "+a+" and "+b +" is "+mul);
		
	}

	@Override
	public void div() {
		System.out.println("Enter two number to perform division operation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int div=a/b;
		System.out.println("Division of "+a+" and "+b +" is "+div);
		
	}
	public static void main(String[] args) {
		c_Interface_Math obj1 =new d_Student1();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
	}

}
