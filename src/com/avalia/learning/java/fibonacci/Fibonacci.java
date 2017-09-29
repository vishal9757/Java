package com.avalia.learning.java.fibonacci;

import java.util.ArrayList;

public class Fibonacci{

	public Integer[] fibonacci(int i) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(0, 0);
		al.add(1, 1);
		int x = 2;
		while (x < i) {
			al.add(x, al.get(x-1)+al.get(x-2));
			x++;
		}
		return al.toArray(new Integer[al.size()]);
	}

	public void print(Integer[] integers){
		for (int j = 0; j < integers.length; j++) {
			System.out.println(integers[j]);
		}
	}
}
