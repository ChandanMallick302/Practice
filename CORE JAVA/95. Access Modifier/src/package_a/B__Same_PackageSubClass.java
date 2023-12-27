package package_a;

public class B__Same_PackageSubClass extends A_Same_Class{
	public static void main(String[] args) {
		B__Same_PackageSubClass b=new B__Same_PackageSubClass();
		System.out.println(b.b);//default
		System.out.println(b.c);//protected
		System.out.println(b.d);//public	
	}
}
