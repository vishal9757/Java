package com.avalia.java.learning.linkedlist;

public class Employee {
	int id;
	int age;

	public Employee(int id, int age) {
		this.id = id;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"->"+age;
	}
}
