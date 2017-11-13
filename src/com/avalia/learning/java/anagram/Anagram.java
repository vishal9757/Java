package com.avalia.learning.java.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public void find(String sentence, String str) {
		String[] dictionary = sentence.split(" ");
		List<Character> match = new ArrayList<Character>();
		for (Character c : str.toCharArray()) {
			match.add(c);
		}
		for (String w : dictionary) {
			List<Character> word = new ArrayList<Character>();
			for (Character c : w.toCharArray()) {
				word.add(c);
			}

			if (word.containsAll(match) && match.containsAll(word)) {
				System.out.println(w);
			}
		}

	}

	public void find1(String sentence, String str) {
		String[] dictionary = sentence.split(" ");
		char[] match = str.toCharArray();
		sort(match);
		for (String w : dictionary) {
			char[] word = w.toCharArray();
			sort(word);

			if (arrayEquals(word, match)) {
				System.out.println(w);
			}
		}
	}

	public void sort(char[] word) {
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < word.length; j++) {
				if (word[i] < word[j]) {
					char temp = word[i];
					word[i] = word[j];
					word[j] = temp;
				}
			}
		}

	}

	public boolean arrayEquals(char[] word, char[] match) {
		if (word == null || match == null) {
			return false;
		}
		if (word.length != match.length) {
			return false;
		}
		for (int i = 0; i < match.length; i++) {
			if (match[i] != word[i]) {
				return false;
			}
		}
		return true;
	}

	public void find2(String sentence, String str) {
		String[] dictionary = sentence.split(" ");
		char[] match = str.toCharArray();
		Arrays.sort(match);
		for (String w : dictionary) {
			char[] word = w.toCharArray();
			Arrays.sort(word);

			if (Arrays.equals(word, match)) {
				System.out.println(w);
			}
		}
	}

}
