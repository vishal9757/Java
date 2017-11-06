package com.avalia.learning.java.threading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			int[][] x = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
			// int [][] x = new int [10000][10000];
			Result result = new Result();
			Thread t1 = new Thread(new RunnableThread(x, 0, 2, result));
			Thread t2 = new Thread(new RunnableThread(x, 1, 2, result));
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println(result.getResult());
		}

		System.out.println(System.currentTimeMillis()-start);
	}

}
