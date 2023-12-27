package Lamda_Expression;

public class Main {

	public static void main(String[] args) {
		System.out.println("My ststem starts.....");

		// Using the separate implemented class
		Myinterface m1 = new Myinterimpl();
		m1.sayHello();

		// Using the interface by the help of anonymous class
		Myinterface m2 = new Myinterface() {

			@Override
			public void sayHello() {
				System.out.println("This is first anonymous class");

			}
		};
		Myinterface m3 = new Myinterface() {

			@Override
			public void sayHello() {
				System.out.println("This is second anonymous class");

			}
		};

		m2.sayHello();
		m3.sayHello();

		// using the interface by the help of lambda
		Myinterface m4 = () -> 
			System.out.println("This is first time i am using lambda");
		m4.sayHello();
		
		
		// implementing SumInterface by lambda
		SumInterface s1= (a,b)->a+b;
		System.out.println(s1.sum(10, 20));
		System.out.println(s1.sum(20, 40));
		
		// implementing LengthInterface by lambda
		LengthInterface lengthInterface=str->str.length();
		System.out.println(lengthInterface.getLength("Chandan Mallick"));
	}
	
	
	
	

}
