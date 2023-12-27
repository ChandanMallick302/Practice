package Nasted_If_Statement;

import java.util.Scanner;

public class Nasted_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age; //20
		int weight; //60
		System.out.println("Enter the Age :");
		age = sc.nextInt();
		System.out.println("Enter the Weight :");
		weight = sc.nextInt();
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You have passed the eligible test and you are eligible to donate blood");
			}
		}

		sc.close();
	}
}