package inheritance;

class one{
	public void print_simplilearn() {
		System.out.println("Simplilearn");
	}
}
class two extends one {
	public void print_happy() {
		System.out.println("Happy");
	}
}
class three extends two{
	public void pring_learning() {
		System.out.println("Learning");
	}
}
public class b_multilevelInheritace_Main {

	public static void main(String[] args) {
		three obj=new three();
		obj.pring_learning();
		obj.print_happy();
		obj.print_simplilearn();
		
		two obj2=new two();
		obj2.print_happy();
		obj2.print_simplilearn();
	}

}
