package package_a;

public class A_Same_Class {

	private String a = "Hello";// private
	int b = 10;// Default
	protected long c = 256;// protected
	public double d = 42.5654;// public

	public static void main(String[] args) {
		A_Same_Class a = new A_Same_Class();
		System.out.println(a.a);// Calling private 
		System.out.println(a.b);// Calling default
		System.out.println(a.c);// Calling protected
		System.out.println(a.d);// Calling public

	}
}