package com.avalia.learning.java.palindrome;

import java.util.ArrayList;

public class ArraySum1 {
	public void Check(int[] a) {
		int[] p = new int[a.length];
		int[] q = new int[a.length];
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 16) {
					p[x] = i;
					q[x] = j;
					x++;
				}
			}
		}
		for (int j = 0; j < p.length; j++) {
			System.out.print(p[j]);
			System.out.print(q[j]);
			System.out.println();
		}
	}
}
