package com.debug;

public class Simple_Java_Program_Debug_Test {

	public static void main(String[] args) {
		System.out.println("goning to debug our simple java application");
		
		//Add Break point here
		int myarr[] = { 2, 5, 7, 81 };
		int sum = getSum(myarr);
		System.out.println("sum = " + sum);
	}

	public static int getSum(int arr[]) {
		int sum = 0;
		//add break point here
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		sum = sum + 8; // By mistakenly added
		
		//Add break point here
		return sum;
	}
}