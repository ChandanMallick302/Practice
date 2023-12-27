package Sorting_the_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable<Employee1>{
	private int empid;
	private String ename;
	private int phone;
	private String address;
	
	//To sort empid
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.empid-o.empid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee1(int empid, String ename, int phone, String address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.phone = phone;
		this.address = address;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", ename=" + ename + ", phone=" + phone + ", address=" + address + "]";
	}




}

public class Make_Custom_Sort_Logic_By_Comparable {

	public static void main(String[] args) {
		List<Employee1> emp1=new ArrayList<>();
		emp1.add(new Employee1(1,"Chandan",99381212,"Balasore"));
		emp1.add(new Employee1(3,"Ramesh",99355454,"Nilgiri"));
		emp1.add(new Employee1(2,"Rajesh",993846465,"Saer"));
		
		System.out.println(emp1);
		
		//sorting id by comparable
		Collections.sort(emp1);
		System.out.println(emp1);
		
		// in comparable you can only one can sort ata atime
		
		
	
	}

}
