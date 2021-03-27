package com.practice.oops;
class Employee{
	String eid;
	String ename;
	float esal;
	String eaddr;
	void getEmployeeDetails()
	{
		System.out.println("Employee id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+esal);
		System.out.println("Employee Address : "+eaddr);
		
	}
	
}
class Manager extends Employee{
	Manager(String eid, String ename, float esal, String eaddr)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
		
	}
	void getManagerDetails()
	{
		System.out.println("Manager Details");
		System.out.println("----------------");
		getEmployeeDetails();
	}
}
class Accountant extends Employee{
	Accountant(String eid,String ename,float esal,String eaddr)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
	}
	void getAccountantDetails()
	{
		System.out.println("Accountant Details");
		System.out.println("--------------------");
		getEmployeeDetails();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Manager m = new Manager("M-111","XXX",45000,"NO:12 AAA BBB");
		m.getManagerDetails();
		System.out.println();
		Accountant a = new Accountant("A-111","YYY",30000,"N0:123 CCC DDD");
		a.getAccountantDetails();
		
		

	}

}
