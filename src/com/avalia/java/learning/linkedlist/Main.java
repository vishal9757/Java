package com.avalia.java.learning.linkedlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(3);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n0 = new Node(0);

		Node n00 = null;
		Node n01 = null;
		n1.add(n00, n2);
		n2.add(n1, n3);
		n3.add(n2, n4);
		n4.add(n3, n5);
		n5.add(n4, n6);
		n6.add(n5, n7);
		n7.add(n6, n8);
		n8.add(n7, n9);
		n9.add(n8, n0);
		n0.add(n9, n01);

		Node head;
		print(n1);

		System.out.println("\nReversed list");
		// Reversing double linked list
		reverseList(n0);

		System.out.println("\nRepeating value");
		// finding repeating value in linked list
		repeatingValue(n1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Number tobe added");
		int x = sc.nextInt();
		int y = sc.nextInt();

		Node add = new Node();
		Node temp = null;
		head = n1;
		while (head != null) {
			if (head.data == x) {
				add.data = y;
				;
				temp = head.next;
				head.next = add;
				add.next = temp;
				// add.priv=head;
				// add.next=head.next;
				System.out.println();
				break;

			}
			head = head.next;
		}

		head = n1;
		while (head != null) {
			System.out.print(head + "->");
			head = head.next;
		}
		// System.out.println("\n"+add.priv+"->"+add+"->"+add.next+"->"+n7.next+"->"+n9.priv);

		// Finding the highest value in linked list
		temp = highestValue(n1);

		System.out.println("\nHighest Value is ->" + temp);
	}

	private static void repeatingValue(Node n1) {
		Node head1 = n1;
		while (head1 != null) {
			int x = head1.data;
			Node y = head1.next;
			while (y != null) {
				if (x == y.data)
					System.out.println(x);
				y = y.next;
			}
			head1 = head1.next;
		}
	}

	private static void reverseList(Node n0) {
		Node head;
		head = n0;
		while (head != null) {
			System.out.print(head + "->");
			head = head.priv;
		}
	}

	private static void print(Node n1) {
		Node head = n1;
		while (head != null) {
			System.out.print(head + "->");
			head = head.next;
		}
	}

	private static Node highestValue(Node n1) {
		Node head;
		Node temp;
		temp = n1;
		Node temp1 = null;
		head = n1;
		while (head != null) {
			temp1 = head.next;
			while (temp1 != null) {
				if (head.data < temp1.data && (head.data > temp.data || temp1.data > temp.data)) {
					temp = temp1;
					break;
				}
				temp1 = temp1.next;
			}
			head = head.next;
		}
		return temp;
	}
}
