package com.avalia.learning.java.palindrome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraySum {
	public void Check(int[] a, int sum) {

		// Map<Integer,Integer> map = new HashMap<>();
		//
		// for (int i : a) {
		// int complement = sum-i;
		// if(map.get(complement)!=null)
		// System.out.println(i+"->"+complement);
		// else
		// map.put(i, i);
		// }
		//

		List<Complement> al = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 16) {
					al.add(new Complement(a[i], a[j]));
				}
			}
		}
		for (Complement complement : al) {
			System.out.println(complement);
		}
	}
}
