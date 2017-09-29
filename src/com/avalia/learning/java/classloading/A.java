package com.avalia.learning.java.classloading;

public class A {
	{System.out.println("This is A instance block");}
	static{
		System.out.println("This is A class static block");
	}
	public A() {
		System.out.println("This is A constructor");
	}
}
