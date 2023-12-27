package Flow_Of_Execution;

public class Static_Block {

	static {
		System.out.println("Static Block executed");
	}
	{
		System.out.println("Non-static block is executed");
	}
	void method1() {
		System.out.println("Non-static Method is excuted");
	}
	static void method2() {
		System.out.println("Static Method is excuted");
	}
	public static void main(String[] args) {
		System.out.println("Main method executed");
		method2();
		Static_Block s1=new Static_Block();
		s1.method1();
		
		//1.Static Block
		//2.Static Method
		
		//After creating object
		
		//3.Non-Static Block
		//1.Non-Static method
	}
}