package static_nested_class;

public class static_nested_class {
	static int data = 30;

	// Static nested class can access static data members of the outer class, including private. 
	// The static nested class cannot access non-static (instance) data members or
	static class inner {
		static void msg() {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		static_nested_class.inner.msg();
	}
}
