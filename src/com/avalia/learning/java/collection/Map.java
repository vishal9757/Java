package com.avalia.learning.java.collection;

import java.util.LinkedList;

public class Map {
	
	public void Arrange(int[] i){
		LinkedList<Integer> l = new LinkedList<>();
		for (int j = 0; j < i.length; j++) {
			l.add(i[j]);
		}
		Integer[] a =new Integer[8];
		l.toArray(a);
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}
