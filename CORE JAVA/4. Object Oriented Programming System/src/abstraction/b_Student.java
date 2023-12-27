package abstraction;

public class b_Student extends a_AbstractClass_persion{

	private int StudentID;
	public b_Student(String nm, String gen, int id) {
		super(nm, gen);
		this.StudentID=id;
	}

	@Override
	public void Studing() {
		if(StudentID ==0) {
			System.out.println("Not Studing");
		}
		else {
			System.out.println("Pursing a Degree in B-TECH");
		}
	}
	public static void main(String[] args) {
		a_AbstractClass_persion std1=new b_Student("Chandan", "Male", 0);
		a_AbstractClass_persion std2=new b_Student("Rajesh", "Male", 2);
		std1.Studing();
		std2.Studing();
	}

}
