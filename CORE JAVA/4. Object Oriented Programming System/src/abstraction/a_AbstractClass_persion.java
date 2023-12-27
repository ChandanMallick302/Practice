package abstraction;

public abstract class a_AbstractClass_persion {

	private String name;
	private String gender;
	public a_AbstractClass_persion(String nm, String gen) {
		this.name=nm;
		this.gender=gen;
	}
	public abstract void Studing();
	
	@Override
	public String toString() {
		return "Name "+this.name+ " ::Gender "+this.gender;
	}	
}
