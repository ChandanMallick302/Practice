package Nested_Interface;

interface showable {
	void show();

	interface message {
		void msg();
	}
}

class a implements showable {

	@Override
	public void show() {
		System.out.println("I am from showable interface");

	}

	class b implements showable.message {

		@Override
		public void msg() {
			System.out.println("I am from message interface");

		}

	}

}

public class NestedInterface extends a {
	public static void main(String[] args) {
		a ob1 = new a();
		ob1.show();
		a.b ob2 = ob1.new b();
		ob2.msg();
	}

}
