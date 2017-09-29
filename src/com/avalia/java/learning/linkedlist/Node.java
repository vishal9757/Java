package com.avalia.java.learning.linkedlist;

public class Node {
	int data;
	Node next;
	Node priv;
	
	public Node(){
		
	}

	public Node(int data) {
		this.data = data;
	}

	public void add(Node n1, Node n2) {

		this.next = n2;
		this.priv = n1;

	}

	@Override
	public String toString() {
		return data + "";
	}

}
