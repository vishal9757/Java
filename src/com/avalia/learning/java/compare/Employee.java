package com.avalia.learning.java.compare;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String dept;

	public Employee(int id, String name,String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;

	}

	public String getName() {
		return this.name;
	}
	
	public String getDept() {
		return this.dept;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "->" + name+"->"+dept;
	}

	@Override
	public int compareTo(Employee o) {
		return new Integer(this.id).compareTo(o.id);

	}

	// @Override
	// public int compareTo(Employee o) {
	// if (this.id == o.id)
	// return 0;
	// else if (this.id > o.id)
	// return 1;
	// else
	// return -1;
	// }
}
