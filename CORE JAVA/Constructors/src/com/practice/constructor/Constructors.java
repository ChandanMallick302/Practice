package com.practice.constructor;

class a {
	// Non-Parameterized Constructor
	public a() {
		System.out.println("Non-Parameterized Constructor of class a");
	}
	public a(int i) {
		System.out.println("Non-Parameterized Constructor of class a " + i);
	}
}
class b extends a {
	
	// Parameterized Constructor
	public b(int i, String c) {
		System.out.println("Parameterized Constructor");
	}

	//calling parent constructor in child constructor
	public b(String c, int i) {
		super(); // calling parent class (a) constructor in child class (b)
		System.out.println("overloading constructor 1 of class b");
	}

	// overloading constructor
	public b(short i, String c) {
		System.out.println("overloading constructor 2");
	}

	public b(int i) {
		System.out.println("overloading constructor 3");
	}
	//calling parent parameterized constructor in child constructor
	public b(String c) {
		super(1);
		System.out.println("overloading constructor");
	}
}

public class Constructors {

	public static void main(String[] args) {
		b b = new b("");

	}

}
