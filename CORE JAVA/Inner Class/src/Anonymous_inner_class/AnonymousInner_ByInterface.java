package Anonymous_inner_class;
interface Eatable{
	void eat();
}
class AnonymousInner_ByInterface {
public static void main(String[] args) {
	//First create object of interface
	Eatable e=new Eatable() {
		
		@Override
		public void eat() {
			System.out.println("I am eating rice");
			
		}
	};
	e.eat();
}
}
