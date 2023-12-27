package Fetching_the_Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Enumeration_Cursor_Object_Traverse {

	public static void main(String[] args) {
		Vector<String> v=new Stack<String>();
		
		//Enumeration cursor can be used in Vector and its child class
		
		v.add("Ramesh");
		v.add("Suresh");
		v.add("Rajesh");
		v.add("Paresh");
		v.add("Umesh");
		v.add("Bhabesh");

		Enumeration<String> e=v.elements();
		
		//Forward Direction traverse only 
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
