package Anonymous_inner_class;
abstract class Person{
	abstract void eat();
}

class AnonymousInner_ByAbstractClass {

	public static void main(String[] args) {
		//first create the object of abstract class
		Person p1=new Person() {
			
			@Override
			void eat() {
				System.out.println("I am eating");
				
			}
		};
		p1.eat();
	}

}
