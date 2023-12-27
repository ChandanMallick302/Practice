package While_Loop;

import java.util.Scanner;

public class While_Loop {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();// 1
		while (i <= 5) {
			System.out.println(i); // 1 2 3 4 5
			i++;
		}
		sc.close();
	}
}