package Immuted_Collection;

import java.util.List;

public class Immuted_Collection {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,5,6,4,60);
//		list.add(12);// it can't possible This is if=s fixed and ImmutableCollections
		list.forEach(e->{System.out.println(e);});
	}
}
