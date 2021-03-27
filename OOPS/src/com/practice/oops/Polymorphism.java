package com.practice.oops;
class Addition{
	void add(int i1, int i2){
		System.out.println("Integer Addition : "+i1+i2);
	}
	void add(float f1, float f2)
	{
		System.out.println("Float Addition : "+f1+f2);
	}
	void add(String s1, String s2)
	{
	    System.out.println("String Addition : "+s1+s2);	
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(1,2);
		a.add(20f, 30f);
		a.add("hi","guys");
	}

}
