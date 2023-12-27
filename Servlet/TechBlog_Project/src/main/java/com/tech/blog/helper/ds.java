package com.tech.blog.helper;

public class ds {

	private int a = 20;
	private static int b=30;
	
	public int sum = a + b;

	public static void main(String[] args) {
		ds d = new ds();
		System.out.println(d.sum);
		System.out.println(b);
	}
}
