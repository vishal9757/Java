package com.avalia.java.learning.linkedlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Node n1 = new Node(2);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(3);
		Node n6 = new Node(3);
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

		Node head = n1;
//		while (head != null) {
//			System.out.print(head + "->");
//			head = head.next;
//		}
//
//		System.out.println("\nReversed list");
//		// Reversing double linked list
//		head = n0;
//		while (head != null) {
//			System.out.print(head + "->");
//			head = head.priv;
//		}
//
//		System.out.println("\nRepeating value");
//		// finding repeating value in linked list
//		Node head1 = n1;
//		while (head1 != null) {
//			int x = head1.data;
//			Node y = head1.next;
//			while (y != null) {
//				if (x == y.data)
//					System.out.println(x);
//				y = y.next;
//			}
//			head1 = head1.next;
//		}
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Node add = new Node();
		Node temp = null;
		head=n1;
		while(head!=null){
			if(head.data==x){
				add.data=y;;
				temp=head.next;
				head.next=add;
				add.next=temp;
//				add.priv=head;
//				add.next=head.next;
				System.out.println();
				break;
				
			}
			head=head.next;
		}
		
//		head = n1;
		while (n1 != null) {
			System.out.print(n1 + "->");
			n1= n1.next;
		}
//		System.out.println("\n"+add.priv+"->"+add+"->"+add.next+"->"+n7.next+"->"+n9.priv);
	}
}
