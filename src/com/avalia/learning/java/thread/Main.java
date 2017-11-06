package com.avalia.learning.java.thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		MyThread m = new MyThread(lock);
		
	//	m.run();
		
		MyRunnable m1 = new MyRunnable(lock);
		Thread t = new Thread(m1);
		Thread t2 = new Thread(m1);
		t.start();
		m.start();
		
		//t2.start();
		
	}

}
