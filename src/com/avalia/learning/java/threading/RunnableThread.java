package com.avalia.learning.java.threading;

public class RunnableThread implements Runnable {
	private int[][] arr;
	private int startRow;
	private int increment;
	private Result result;

	public RunnableThread(int[][] arr, int startRow, int increment, Result result) {
		this.arr = arr;
		this.startRow = startRow;
		this.increment = increment;
		this.result = result;
	}

	public void run() {
		int sum = 0;
		for (int i = startRow; i < arr.length; i = i + increment) {
			sum += sum(arr[i]);
		}
		result.setResult(sum);
	}

	private int sum(int[] row) {
		int sum = 0;
		for (int i = 0; i < row.length; i++) {
			sum = sum + row[i];
		}
		return sum;
	}

}
