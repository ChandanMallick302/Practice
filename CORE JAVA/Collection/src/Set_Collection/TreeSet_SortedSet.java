package Set_Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_SortedSet {

	public static void main(String[] args) {
		SortedSet<Integer> ss=new TreeSet<>();
		ss.add(1);
		ss.add(12);
		ss.add(15);
		ss.add(1);
		ss.add(14);
		ss.add(13);
		
		ss.forEach(a->{System.out.println(a);});

		System.out.println(ss.first());
		System.out.println(ss.last());
		//1. It is the child of SortedSet
		//2. Given order are not preserved
		//3. Duplicates are not allowed
		//4. it is having sorting functionality
		//5. you can make you own custom sorting
		
		
		//Make Custom sorting logic by the help of Comparable and Comparator
		
	}

}
