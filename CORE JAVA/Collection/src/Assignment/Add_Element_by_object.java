package Assignment;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private String name;
	
	void setName(String name) {
		this.name=name;
	}

	String getName() {
		return name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}

public class Add_Element_by_object {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		
		//add Employee name by creating Employee object
		emp.add(new Employee("Chandan"));
		emp.add(new Employee("Ramesh"));
		emp.add(new Employee("Suresh"));
		emp.add(new Employee("Mahesh"));
		emp.add(new Employee("Rajesh"));
		
		
		//For output
		emp.forEach(e->{System.out.println(e.getName());});

	}

}
