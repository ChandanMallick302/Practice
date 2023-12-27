package inheritance;

class Teacher {
	String degignation = "Teacher";
	String CollegeName = "Simplilearn";

	String does() {
		return "Teaching";
	}
}

public class a_SingleInheritance_JavaTeacher extends Teacher  {

	public static void main(String[] args) {
		String mainsubject="Core java";
		a_SingleInheritance_JavaTeacher obj1=new a_SingleInheritance_JavaTeacher();
		System.out.println("Java "+obj1.degignation);
		System.out.println(obj1.CollegeName);
		System.out.println(mainsubject+" "+obj1.does());
	}
}
