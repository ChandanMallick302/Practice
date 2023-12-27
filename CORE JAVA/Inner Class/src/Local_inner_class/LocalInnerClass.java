package Local_inner_class;

public class LocalInnerClass {
	private int data = 30;

	void display() {
		// If you want to invoke the methods of the local inner class, you must
		// instantiate this class inside the method.
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l1 = new Local();
		l1.msg();
	}

	public static void main(String[] args) {
		LocalInnerClass l1 = new LocalInnerClass();
		l1.display();
	}
}
