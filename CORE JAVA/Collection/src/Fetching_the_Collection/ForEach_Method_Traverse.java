package Fetching_the_Collection;

import java.util.ArrayList;

public class ForEach_Method_Traverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Ramesh");
		al.add("Suresh");
		al.add("Rajesh");
		al.add("Paresh");
		al.add("Umesh");
		al.add("Bhabesh");
		
		//Traversing by forEach() method
		al.forEach(e->{System.out.println(e);});

	}

}
