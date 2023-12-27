package Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Impliment_All_Methods {

	public static void main(String[] args) {

		// Creating Generic Type List
		List<String> list = new ArrayList<String>(); // there is no use of type-casting when it is used in generics
														// collection ArrayList<String>().

		// Adding name in to list
		list.add("Chandan");
		list.add("Rajesh");
		list.add("Suresh");
		list.add("Ramesh");
		list.add("Umesh");
		list.add("Puja");

		System.out.println("Fisrt List is " + list);

		// Adding all element at a time from another collection
		List list2 = new Vector<>();
		list2.addAll(list);

		System.out.println("After adding multiple elements at a time " + list2);
		
		// Remove the name from the list
		list.remove(1);// remove by index no
		list.remove("Chandan"); // remove by name

		System.out.println("After Removing Chandan, Rajesh " + list);

		// Adding new element in list
		list.add(1, "Ram");

		System.out.println("After adding Ram in index-1 " + list);

		// Replacing the existing to new element
		list.set(3, "Tapas");
		System.out.println("After Replacing Umesh to Tapas " + list);

		// Remove all from the list
		list.clear();
		System.out.println("After clearing all from the list " + list);

		// showing output
		System.out.println(list);
		System.out.println("List size is: " + list.size());// to check the list size
		System.out.println("Is chandan is available in list ? " + list.contains("Umesh")); // check availability of data
																							// in the list
		System.out.println("Is list is empty ? " + list.isEmpty());// to check either list is empty or not

	}

}
