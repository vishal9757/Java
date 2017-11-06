package com.avalia.learning.java.miniorange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LMV {

	static final int NOT_POSSIBLE = -10000;
	// if out put is this i.e soln not possible

	static int longestSubsequence(String s, char[] c) {

		// exit conditions
		if (s.length() == 0 || c.length == 0) {
			return 0;
		}

		if (s.length() < c.length) {
			return NOT_POSSIBLE;
		}

		if (s.length() == c.length) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != c[i]) {
					return NOT_POSSIBLE;
				}
			}
			return s.length();
		}

		if (s.charAt(0) < c[0]) {
			// ignore, go ahead with next item
			return longestSubsequence(s.substring(1), c);
		} else if (s.charAt(0) == c[0]) {
			// <case 1> include item and start search for next item in chars
			// <case 2> include but search for same item again in chars
			// <case 3> don't include item

			return Math.max((1 + longestSubsequence(s.substring(1), Arrays.copyOfRange(c, 1, c.length))),
					(1 + longestSubsequence(s.substring(1), c)));
		} else {
			// ignore
			return longestSubsequence(s.substring(1), c);
		}
	}

	public static int count(String str, char[] match) {

		char[] c = str.toCharArray();
		List<Integer> magicalString = new ArrayList<>();
		int j = 0;
		while (j < str.length()) {
			if (c[j] == 'a')

				magicalString.add(longestSubsequence(str.substring(j), match));
			j++;
		}
		return 0;
	}

	public static void main(String[] args) {

		char[] chars = { 'a', 'e', 'i', 'o', 'u' };

		String s1 = "aeio";
		String s2 = "aaeeieou";
		String s3 = "aeaaeioaaaaaaaaeio";

		System.out.println(longestSubsequence(s1, chars));
		System.out.println(longestSubsequence(s2, chars));
		System.out.println(longestSubsequence(s3, chars));

		count(s3, chars);
	}
}