package com.avalia.java.learning.linkedlist;

public class MyLinkedList<T> {
	LinkedListNode<T> head;
	LinkedListNode<T> tail;

	public void queue(T i) {
		if (head == null && tail == null) {
			tail = head = new LinkedListNode<T>(i);
		} else {
			LinkedListNode<T> newNode = new LinkedListNode<T>(i);
			tail.next = newNode;
			newNode.priv = tail;
			tail = tail.next;
		}
	}

	public T dequeue() {
		LinkedListNode<T> temp = head;
		head = head.next;
		return temp.data;
	}

	public void delete(T obj) {
		LinkedListNode<T> h = head;
		LinkedListNode<T> temp;
		LinkedListNode<T> temp1;
		while (h != null) {
			if (h.data == obj) {
				temp = h.next;
				temp1 = h.priv;
				if (temp1 != null) {
					temp1.next = temp;
				}
				if (temp != null) {
					temp.priv = temp1;
				}
				break;
			}
			h = h.next;
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		LinkedListNode<T> temp = head;
		while (temp != null) {
			sb.append(temp.data + "->");
			temp = temp.next;
		}
		return sb.toString();
	}
}
