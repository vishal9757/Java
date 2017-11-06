package com.avalia.learning.java.threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExampleMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long start = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 1000; i++) {
			int[][] x = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
			Future<Integer> res1 = executor.submit(new CallableThread(x, 0, 2));
			Future<Integer> res2 = executor.submit(new CallableThread(x, 1, 2));
			System.out.println(res1.get() + res2.get());
		}
		System.out.println(System.currentTimeMillis()-start);
		executor.shutdown();
	}

}
