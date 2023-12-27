package Static_Variables;

public class Static_Variable {

	static int a=10;// instance variable can be used as static variable
	       int c=90;
	
	void NonstaticMethod() {
//		static int b=20;// can't use static variable as local variable
		a=20;//static variable can be directly accessible in not-static method 
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		System.out.println(a);//static variable can be directly accessible in static method 
		
		Static_Variable s1=new Static_Variable();
		System.out.println(s1.a);
		System.out.println(s1.c);//To Access Non-static variable in static method we have to create an object of that class
		
		
		
	}
}
