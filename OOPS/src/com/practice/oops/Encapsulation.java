package com.practice.oops;
class StudentDetails{
	private int sid;
	private String sname;
	private int sage;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		StudentDetails s1= new StudentDetails();
		s1.setSid(111);
		s1.setSname("XXX");
		s1.setSage(13);
		System.out.println("Student ID : "+s1.getSid());
		System.out.println("Student Name : "+s1.getSname());
		System.out.println("Student Age : "+s1.getSage());
		
	}

}
