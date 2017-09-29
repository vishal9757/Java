package com.avalia.learning.java.classloading;

public class C extends B {
	{System.out.println("This is C instance block");}
	static{
		System.out.println("This is C class static block");
	}
	public C() {
		System.out.println("This is C constructor");
	}
	
	public static void print() {
		System.out.println("This is Static print");
//		instanceMethodPrint(); Instance method called from static is not allowed
	}
	public void instanceMethodPrint(){
		System.out.println("This is instance method print");
		print();
	}
}
