package com.avalia.learning.java.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
	Queue<Integer> q = new LinkedList<>();
	Queue<Integer> q1 = new LinkedList<>();

	public void push(int x) {
		if (q.isEmpty()) {
			q.add(x);
			while (!q1.isEmpty()) {
				q.add(q1.remove());
			}
		} else if (q1.isEmpty()) {
			q1.add(x);
			while (!q.isEmpty()) {
				q1.add(q.remove());
			}
		}
	}

	public void pop() {
		if (!q.isEmpty())
			System.out.println(q.remove());
		else if (!q1.isEmpty()) {
			System.out.println(q1.remove());
		}
	}

}
