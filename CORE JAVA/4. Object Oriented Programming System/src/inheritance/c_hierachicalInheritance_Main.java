package inheritance;

class One1 {
	public void print_simplilearn() {
		System.out.println("Simplilearn");
	}
}

class Two2 extends One1 {
	public void print_happy() {
		System.out.println("Happy");
	}
}

class Three3 extends One1 {
	public void print_learning() {
		System.out.println("Learning");
	}
}

class four4 extends One1 {
	public void print_home() {
		System.out.println("Home");
	}
}

public class c_hierachicalInheritance_Main {

	public static void main(String[] args) {
		Two2 obj1=new Two2();
		obj1.print_happy();
		obj1.print_simplilearn();
		
		Three3 obj2=new Three3();
		obj2.print_learning();
		obj2.print_simplilearn();
		
		four4 obj3=new four4();
		obj3.print_home();
		obj3.print_simplilearn();
	}

}