package Static_Method;
class Non_static {
	static void show() {
		System.out.println("Static Method from nested calss");
	}
}
public class Static_Method {

	static void run() {
		System.out.println("Static Method");
	}

	void display() {
		System.out.println("Non-static method");
		run();//we can use static method inside Non-static method
	}

	public static void main(String[] args) {
//		display();////we can't use static method inside Non-static method
		
		//to use Non-static method inside static method we have to create object
		Static_Method s1 = new Static_Method();
		s1.display();
		
		run();//we can use static method inside static method
		
		Non_static.show();//we can use static method From nested class inside static method by neatestedclass_name.static_method
		
		
	}
}
