package Unboxing;

public class Object_To_Primitive {

	public static void main(String[] args) {
		Integer obj1=new Integer(100);
		int i=obj1; 		//converting Object_To_Primitive
		System.out.println(obj1);
		//or
		int i1=obj1.intValue(); // compiler will do automatically
		
		Double ob2=new Double(1.12);
		double d1=ob2;
		System.out.println(d1);
		
		
	}
}