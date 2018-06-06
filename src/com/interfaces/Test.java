package com.interfaces;

public class Test {
	public static void main(String args[]) {
		Travel t1=new Car();
		Travel t2=new Dog();
	t1.getspeed();
	t2.getspeed();
System.out.println(t1 instanceof Car);
System.out.println(t2 instanceof Cat);
	}
}
