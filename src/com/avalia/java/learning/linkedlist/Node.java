package com.avalia.java.learning.linkedlist;

public class Node {
	int data;
	Node next;
	Node priv;
	Node head = null;
	Node tail = null;
	Node left;
	Node right;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}

	public void add(Node n1, Node n2) {
		this.next = n2;
		this.priv = n1;
	}

	public void add(int i){
		
		if(tail==null)
			tail=head=new Node(i);
		Node n = head;
		while(n.next==null){
		if(i<n.data)
			n.left=new Node(i);
		else if(i>n.data)
			n.right=new Node(i);
			
		}
	}

	@Override
	public String toString() {
		return data + "";
	}

}
