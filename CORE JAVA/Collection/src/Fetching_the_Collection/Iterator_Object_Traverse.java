package Fetching_the_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Object_Traverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Ramesh");
		al.add("Suresh");
		al.add("Rajesh");
		al.add("Paresh");
		al.add("Umesh");
		al.add("Bhabesh");

//Iterator is used for All collection traversing beacusing its object is present in collection 
       //Traversing by iterator()
		
		// it will give only forward traversing

		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
