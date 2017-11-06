package com.avalia.learning.java.threading;

public class Result {

	private int result;

	public int getResult() {
		return result;
	}

	public synchronized void setResult(int result) {
		this.result = this.result + result;
	}

}
