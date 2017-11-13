package com.avalia.learning.java.balancedparenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesis {

	Map<Character, Character> pair = new HashMap<>();

	public BalancedParenthesis() {
		pair.put('<', '>');
		pair.put('(', ')');
		pair.put('{', '}');
		pair.put('[', ']');
	}

	public boolean check(String str) {
		Stack<Character> stack = new Stack<>();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (pair.keySet().contains(c[i])) {
				stack.push(c[i]);
			} else if (pair.values().contains(c[i])) {
				if (pair.get(stack.peek()) == c[i]) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}

}
