package TypeSafe_And_UnTypeSafe;

import java.util.ArrayList;

public class TypeSafe_Collection {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("dsds");
		name.add("dsdsff");
//		name.add(564); //Because of String type safe error showing

		// output
		System.out.println(name);
	}
}
