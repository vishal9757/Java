package com.avalia.learning.java.thread;

public class MyRunnable implements Runnable {
	private Object lock;

	public MyRunnable(Object lock) {
		this.lock = lock;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		char c = 'a';
		for (int i = 0; i < 10; i++) {
			try {
				synchronized (lock) {
					System.out.println(c);
					c++;
					lock.wait();
					lock.notifyAll();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// try {
		// Thread.currentThread().sleep(2000);
		// int y= t.y;
		// System.out.println(y);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
