package Autoboxing;

public class Primitive_To_Object {

	public static void main(String[] args) {
		int i = 100;
		Integer iobj1=i;		//converting Primitive To Object
		System.out.println(iobj1);
		//or
//		Integer iobj2 = Integer.valueOf(i);// jvm will do automatically
		
		double d1=4.455;
		Double obj3=d1;
		System.out.println(obj3);
	}
}