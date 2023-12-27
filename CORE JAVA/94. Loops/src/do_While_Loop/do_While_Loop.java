package do_While_Loop;

import java.util.Scanner;

public class do_While_Loop {

	public static void main(String[] args) {
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		s=sc.nextInt();//1
		do {
			System.out.println(s);
			s++;
		}
		while(s<=5);//1 2 3 4 5
	}

}
