package com.avalia.learning.java.palindrome;

public class Palindrome {
	public int check(String str) {
		char[] a = str.toCharArray();
		int n = a.length-1;
		//System.out.println(a[2]);
		int x = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[n - i]) {
				if (a[i] == a[n - i - 1])
					x = n - i;
				else if (a[n - i] == a[i + 1])
					x = i;
			}
		}
		return x;
	}
}
