package bitwise;

public class Unsigned {

	public static void main(String[] args) {
		int x=40;  // 0000 0000 0000 0000 0000 0010 1000
		int y=-40; // 1111 1111 1111 1111 1111 0010 1000
		
		System.out.println(x>>5); // 0000 0001 =1
		System.out.println(y>>5); // 1111 1111 1111 1111 1111 0010 1000
		                           // 0000 0111 1111 1111 1111 1111 1001 = 134217726
	}
}
