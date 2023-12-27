package super_And_this_KeyWord;

class B {
	String i;

	public B(String i) {
		// to invoke the current object 'this' is used
		this.i = i;
		System.out.println("class B & " + i);
	}
}

class c extends B {
	public c() {
		// INTITIALIZING PARENT CLASS CONSTRUCTOR BY super()
		super("C");
	}
}

public class A {
	public static void main(String[] args) {
		c b = new c();
	}
}
