package local;

public class Teacher {

	public void Math_Teacher() {
		String deg="Math Teacher";
		int salary=10000025;
		
		System.out.println("Chandan "+deg+" "+salary);
	}
	public void Physics_Teacher() {
		String deg="Physics Teacher";
		int salary=100456542;
		
		System.out.println("Rajesh "+deg+" "+salary);
	}
	public static void main(String[] args) {
		Teacher t1= new Teacher();
		t1.Math_Teacher();
		t1.Physics_Teacher();

	}

}
