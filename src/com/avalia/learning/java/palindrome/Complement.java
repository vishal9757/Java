package com.avalia.learning.java.palindrome;

public class Complement {
	int first;
	int second;

	public Complement(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return first + ":" + second;
	}
}
