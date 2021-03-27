package com.practice.oops;
abstract class A
{
	abstract void a1();
	void a2()
	{
		System.out.println("Normal Method 2, Implemented in same class ");
	}
	abstract void a3();
	
}
class B extends A{
	void a1(){
		System.out.println("Abstract Method 1, Implementation provided by using extended class");
	}
	void a3(){
		System.out.println("Abstract Method 3, Implementation provided by using extended class");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		B b=new B();
		b.a1();
		System.out.println();
		b.a2();
		System.out.println();
		b.a3();
				
		
	}

}
