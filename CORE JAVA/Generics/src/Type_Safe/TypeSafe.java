package Type_Safe;

public class TypeSafe<T> {
	//delclaring the type
	T container;

	public TypeSafe(T container) {
		this.container = container;
	}

	public Object getValue() {
		return container;
	}

	public static void main(String[] args) {

		TypeSafe<String> t1 = new TypeSafe<String>("sdkadn");
		System.out.println(t1.getValue());
		
		TypeSafe<Integer> t2 = new TypeSafe<Integer>(41212);
		System.out.println(t2.getValue());
		
		//To find name of the type of class used in object
		System.out.println(t1.container.getClass().getName());
		System.out.println(t2.container.getClass().getName());

		// Here You can find type safe value

	}

}
