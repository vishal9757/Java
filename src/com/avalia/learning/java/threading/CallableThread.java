package com.avalia.learning.java.threading;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {
	private int[][] arr;
	private int startRow;
	private int increment;

	public CallableThread(int[][] arr, int startRow, int increment) {
		this.arr = arr;
		this.startRow = startRow;
		this.increment = increment;
	}

	private int sum(int[] row) {
		int sum = 0;
		for (int i = 0; i < row.length; i++) {
			sum = sum + row[i];
		}
		return sum;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = startRow; i < arr.length; i = i + increment) {
			sum += sum(arr[i]);
		}
		try {
			Thread.sleep((int) Math.random() * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return sum;
	}

}
