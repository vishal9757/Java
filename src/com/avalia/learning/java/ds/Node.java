package com.avalia.learning.java.ds;

public class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	public Node add(Node o) {
		return this.next = o;

	}

	@Override
	public String toString() {
		return data + "";
	}
}
