package Static;

public class Main {

	public static void main(String[] args) {
		Student.noofstudent=40;
		Student s1=new Student();
		s1.newjoin(4);// 40+=4=44
		Student s2=new Student();
		s2.newjoin(6);// 44+=6=50
	}

}
