package package_b;

import package_a.A_Same_Class;

public class D_Differnt_PackageSubClass extends A_Same_Class{

	public static void main(String[] args) {
		D_Differnt_PackageSubClass d=new D_Differnt_PackageSubClass();
		System.out.println(d.c);//protected
		System.out.println(d.d);//public
	}
}
