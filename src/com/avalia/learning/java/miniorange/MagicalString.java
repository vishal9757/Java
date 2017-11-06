package com.avalia.learning.java.miniorange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicalString {

	char[] match = { 'a', 'e', 'i', 'o', 'u' };
	static final int NOT_POSSIBLE = -10000;

	public int count(String str) {

		char[] c = str.toCharArray();
		List<Integer> magicalString = new ArrayList<>();
		int j = 0;
		while (j < str.length()) {
			if (c[j] == 'a')

				magicalString.add(magicalString(str.substring(j), match));
			j++;
		}
		Integer max = Collections.max(magicalString);
		if (max < 0)
			return 0;
		return max;
	}

	public int magicalString(String str, char[] match) {
		if (str.length() == 0 || match.length == 0) {
			return 0;
		}

		if (str.length() < match.length) {
			return 0;
		}
		if (str.length() == match.length) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != match[i]) {
					return NOT_POSSIBLE;
				}
			}
			return str.length();
		}

		if (str.charAt(0) != match[0]) {
			return magicalString(str.substring(1), match);
		} else if (str.charAt(0) == match[0]) {
			int searchNxtSeq = magicalString(str.substring(1), Arrays.copyOfRange(match, 1, match.length));
			int searchSameSeq = magicalString(str.substring(1), match);
			int max = 1 + Math.max(searchNxtSeq, searchSameSeq);
			return max;
		} else {
			return magicalString(str.substring(1), match);
		}
	}
}
