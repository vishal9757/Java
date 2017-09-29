package com.learning.java.saticvar;

public class Main {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.x++;
		a1.y++;
		a2.x++;
		a2.y++;
		System.out.println("a1.x->"+a1.x+"a1.y->"+a1.y);
		System.out.println("a2.x->"+a2.x+"a2.y->"+a2.y);

	}

}
