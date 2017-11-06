package com.avalia.learning.java.map;

import java.util.TreeMap;

public class Map {

	public void find(String str, char c) {
		char[] a = str.toCharArray();

		TreeMap<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], 0);
		}
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i]))
				map.put(a[i], map.get(a[i]) + 1);
		}

		System.out.println(map.entrySet());

	}
}
