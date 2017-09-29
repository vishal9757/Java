package com.avalia.learning.java.classloading;

public class B extends A {
	{System.out.println("This is B instance block");}
	static{
		System.out.println("This is B class static block");
	}
	public B() {
		System.out.println("This is B constructor");
	}
}
