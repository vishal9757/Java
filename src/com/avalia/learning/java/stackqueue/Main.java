package com.avalia.learning.java.stackqueue;

public class Main {

	public static void main(String[] args) {
		// StackQueue sq = new StackQueue();
		// sq.queue(1);
		// sq.queue(2);
		// sq.queue(3);
		// sq.queue(4);
		// System.out.println(sq.dequeue());
		// sq.queue(7);
		// System.out.println(sq.dequeue());
		QueueStack q = new QueueStack();
		q.push(5);
		q.push(4);
		q.push(6);
		q.push(7); //Stack using 2 queue
		q.pop();
		q.push(8);
		q.pop();
		q.push(9);
		q.pop();
		
	}

}
