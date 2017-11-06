package com.avalia.learning.java.thread;

public class MyThread extends Thread {
	public int x = 2;
	int y;
	private Object lock;

	public MyThread(Object lock) {
		this.lock = lock;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				synchronized (lock) {
					System.out.println(i);
					lock.notifyAll();
					lock.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}