package package_a;

public class C_Same_PackageNonSubClass {
public static void main(String[] args) {
	A_Same_Class a=new A_Same_Class();
	System.out.println(a.b);//default
	System.out.println(a.c);//protected
	System.out.println(a.d);//public
}
}
