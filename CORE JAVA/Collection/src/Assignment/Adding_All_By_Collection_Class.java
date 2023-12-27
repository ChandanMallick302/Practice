package Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Adding_All_By_Collection_Class {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<>();
		
		//Adding All elements by Collections Class
		
		c=Collections.checkedCollection(c, String.class);
		Collections.addAll(c, "Apple","Banana","Grapes","Orange");
		System.out.println(c);
		
		
//		Adding elements by collection interface
		
		c.add("mango");
		System.out.println(c);
		
	}
}
