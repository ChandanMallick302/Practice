package List_Collection;

import java.util.Stack;
import java.util.Vector;

public class Stack_Vector {

	public static void main(String[] args) {
		Vector<Integer> vec = new Stack<>();
		vec.add(4);
		vec.add(5);
		vec.add(6);
		vec.add(1);
		vec.add(5);
		vec.add(0);

		vec.forEach(a -> {
			System.out.println(a);
		});

		// 1. It is the child of vector
		// 1. Given Oder preserved
		// 2. Duplicates are allowed
		// 3. Vector will increase automatically
		// 4. Vector is thread safe class

	}

}
