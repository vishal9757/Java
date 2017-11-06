package com.avalia.java.learning.linkedlist;

public class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	LinkedListNode<T> priv;

	public LinkedListNode(T data) {
		this.data = data;
	}

	

	@Override
	public String toString() {
		return data.toString();
	}

}
