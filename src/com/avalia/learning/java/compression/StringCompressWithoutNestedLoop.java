package com.avalia.learning.java.compression;

public class StringCompressWithoutNestedLoop {

	public static String compressWithSort(String input) {

		StringBuffer s = new StringBuffer();
		char[] arrayElement = input.toCharArray();
		int[] arrayIndex = new int[256];
		for (int i = 0; i < arrayElement.length; i++) {
			int index = arrayElement[i];
			arrayIndex[index] = arrayIndex[index] + 1;
		}
		for (int i = 0; i < arrayIndex.length; i++) {
			if (arrayIndex[i] > 0) {
				s.append((char) i).append(arrayIndex[i]);
			}
		}
		return s.toString();
	}

	public static String compressWithoutSort(String input) {
		StringBuffer ss = new StringBuffer();
		char[] arrayElement = input.toCharArray();
		int[] arrayIndex = new int[256];
		for (int i = 0; i < arrayElement.length; i++) {
			int index = arrayElement[i];
			arrayIndex[index] = arrayIndex[index] + 1;
		}
		for (int i = 0; i < arrayElement.length; i++) {
			char c = arrayElement[i];
			int value = arrayIndex[c];
			if (value > 0) {
				ss.append(c).append(value);
				arrayIndex[c] = 0;
			}
		}
		return ss.toString();
	}

	public static void main(String[] args) {
		System.out.println(compressWithSort("helloworld"));
		System.out.println(compressWithoutSort("helloworld"));
	}

}