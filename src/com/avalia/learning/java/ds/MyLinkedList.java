package com.avalia.learning.java.ds;

public class MyLinkedList {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

		public void add(Node o) {
			 this.next = o;

		}

		@Override
		public String toString() {
			return data + "";
		}
	}

	Node head = null;
	Node tail = null;

	public void queue(int i) {
		if (head == null && tail == null) {
			tail = head = new Node(i);
		} else {
			tail.next = new Node(i);
			tail=tail.next;
		}
	}

	public int dequeue() {
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node temp = head;
		while (temp != null) {
			sb.append(temp.data + "->");
			temp = temp.next;
		}
		return sb.toString();
	}

}
