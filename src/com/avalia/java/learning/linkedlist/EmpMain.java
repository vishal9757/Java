package com.avalia.java.learning.linkedlist;

public class EmpMain {

	public static void main(String[] args) {
		MyLinkedList<Employee> list = create();
		System.out.println(list);
		delete(list, 8);
		System.out.println(list);
	}

	private static void delete(MyLinkedList<Employee> list, int id) {
		LinkedListNode<Employee> head = list.head;
		while (head != null) {
			if (head.data.id == id) {
				list.delete(head.data);
				break;
			}
			head = head.next;
		}
	}

	private static MyLinkedList<Employee> create() {
		MyLinkedList<Employee> list = new MyLinkedList<Employee>();
		list.queue(new Employee(1, 21));
		list.queue(new Employee(2, 22));
		list.queue(new Employee(3, 23));
		list.queue(new Employee(4, 24));
		list.queue(new Employee(5, 25));
		list.queue(new Employee(6, 26));
		list.queue(new Employee(7, 27));
		list.queue(new Employee(8, 28));
		list.queue(new Employee(9, 29));
		return list;
	}
}
