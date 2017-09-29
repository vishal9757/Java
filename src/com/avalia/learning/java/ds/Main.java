package com.avalia.learning.java.ds;

public class Main {

	public static void main(String[] args) {
		Node n1 = new Node(5);
		Node n2 = new Node(6);
		Node n3 = new Node(7);
		Node n4 = new Node(8);
		Node n5 = new Node(9);
		n1.add(n2);
		n2.add(n3);
		n3.add(n4);
		n4.add(n5);
		
		Node head = n1;
		print(head);
//		Node n = reverse(head);
//		print(n);

		// MyLinkedList l1 = new MyLinkedList();
		//
		// l1.queue(5);
		// l1.queue(5);
		// l1.queue(6);
		// l1.queue(7);
		// l1.queue(5);
		// l1.queue(5);
		// System.out.println(l1);
		// l1.dequeue();
		// System.out.println(l1);

	}

	public static void print(Node head) {
		while (head != null) {
			System.out.print(head + "->");
			head = head.next;
		}
	}
//
//	public static Node reverse(Node h) {
//		if (h == null) {
//			return null;
//		}
//		if (h.next == null) {
//			return h;
//		}
//		Node p1 = null;
//		Node p2 = h;
//		Node p3 = null;
//		while (p2 != null) {
//			System.out.println("P1->" + p1 + ":p2->" + p2 + ":p3->" + p3);
//			p3 = p2.next;
//			p2.next = p1;
//			p1 = p2;
//			p2 = p3;
//		}
//		return p1;
//
//	}

}
