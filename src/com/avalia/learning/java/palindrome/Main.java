package com.avalia.learning.java.palindrome;

public class Main {

	public static void main(String[] args) {
		// Palindrome p = new Palindrome();
		// System.out.println(p.check("aabca"));
		//
		// ArraySum a = new ArraySum();
		// int[] b={9,6,4,8,10};
		// a.Check(b,16);

		Armstrong arm = new Armstrong();
		for (int i = 0; i < 1000000; i++) {

			if (arm.check(i))
				System.out.println(i);
		}
	}

}
