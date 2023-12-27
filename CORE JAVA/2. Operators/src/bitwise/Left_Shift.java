package bitwise;

public class Left_Shift {

	public static void main(String[] args) {
		int a=10; //1010
		int b=15; //1111
		int c=20; //10100
		
		System.out.println(a<<2); // 101000 =40
		System.out.println(a<<3); // 1010000=80
		System.out.println(b<<2); // 111100 =60
		System.out.println(c<<5); // 1010000000=640
	}
}
