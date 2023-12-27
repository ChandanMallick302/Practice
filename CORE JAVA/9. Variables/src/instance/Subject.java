package instance;

public class Subject {

	int subcode=0;
	String subject="";
	public Subject(int sc, String s) {
		this.subcode=sc;
		this.subject=s;
		System.out.println(this.subcode+" "+this.subject);
	}
}
