package Static;

public class Student {

	static int noofstudent=0;
	public void newjoin(int newstudent) {
		noofstudent+=newstudent;
		System.out.println(noofstudent);
	}

}
