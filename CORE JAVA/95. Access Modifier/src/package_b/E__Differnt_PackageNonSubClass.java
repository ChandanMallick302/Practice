package package_b;

import package_a.A_Same_Class;

public class E__Differnt_PackageNonSubClass {

	public static void main(String[] args) {
		A_Same_Class a = new A_Same_Class();
		System.out.println(a.d);// public
	}
}
