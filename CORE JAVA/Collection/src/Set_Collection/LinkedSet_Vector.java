package Set_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedSet_Vector {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new LinkedHashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(7);
		set.add(5);
		set.add(6);
		set.add(1);
		
		set.forEach(a->{System.out.println(a);});
		
		//1. Given order are preserved
		//2. Duplicates are not allowed
		//3. It is the child of HashSet

	}

}
