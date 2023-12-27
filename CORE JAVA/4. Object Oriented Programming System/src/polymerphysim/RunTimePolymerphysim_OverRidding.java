package polymerphysim;
class Animal{
	public void color(String c) {
		System.out.println("Color is "+c);
	}
	public void eat(String e) {
		System.out.println("Eating "+e);
	}
}
class Dog extends Animal{

	@Override
	public void color(String c) {
		// TODO Auto-generated method stub
		System.out.println("Color is "+c);
	}
	@Override
	public void eat(String e) {
		// TODO Auto-generated method stub
		super.eat(e);
		System.out.println("Eating "+e);
	}
}
// Here jvm will choose which one going to be run
//Here methods are same but different arguments
// Overriding can achieve by parent and child class
public class RunTimePolymerphysim_OverRidding {

	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.color("Black");
		a1.eat("Rice");
	}

}
