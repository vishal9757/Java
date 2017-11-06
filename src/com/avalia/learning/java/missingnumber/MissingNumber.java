package com.avalia.learning.java.missingnumber;

import java.util.TreeMap;

public class MissingNumber {

	public void getMissingNumber(String str) {
		char input[] = str.toCharArray();
		TreeMap<Character, Integer> map = new TreeMap<>();
		for (char i = 48; i <= 57; i++) {
			map.put(i, 0);
		}
		for (int i = 0; i < input.length; i++) {
			if (map.containsKey(input[i])) {
				map.put(input[i], map.get(input[i]) + 1);
			}
		}
		System.out.println(map.entrySet());
		
		TreeMap<Character, Integer> expectedMap = new TreeMap<>();
		expectedMap.put((char) 48, 2);
		expectedMap.put((char) 49, 12);
		expectedMap.put((char) 50, 3);
		expectedMap.put((char) 51, 2);
		expectedMap.put((char) 52, 2);
		expectedMap.put((char) 53, 2);
		expectedMap.put((char) 54, 2);
		expectedMap.put((char) 55, 2);
		expectedMap.put((char) 56, 2);
		expectedMap.put((char) 57, 2);
		
		
		
		String temp = "";

		for (char i = 48; i <= 57; i++) {
			if(expectedMap.get(i)-map.get(i)>0){
				temp = temp+i;
			}
		}
		System.out.println(temp);
	}
	
	public  int count8(int from, int to) {
	    int count = 0;
	    for (int i = from; i <= to; i++) {
	        int j = i;
	        while (j > 0) {
	            if (j % 10 == 8)
	                count++;
	            j /= 10;
	        }
	    }
	    return count;
	}
}
