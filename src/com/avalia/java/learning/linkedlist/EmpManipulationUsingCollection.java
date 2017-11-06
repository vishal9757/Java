package com.avalia.java.learning.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpManipulationUsingCollection {
	public static void main(String args[]) {
		EmpManipulationUsingCollection col = new EmpManipulationUsingCollection();
		ArrayList<Employee> emp = col.createEmpList();
		col.print(emp);
		col.delete(emp, 5);
		col.print(emp);
	}

	private void print(ArrayList<Employee> emp) {
		for (Employee e : emp) {
			System.out.println(e);
		}

	}

	private void delete(ArrayList<Employee> emp, int id) {

		for (Iterator<Employee> iterator = emp.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			if (e.id == id) {
				iterator.remove();
				System.out.println("Removing"+emp.get(4));
			}
		}
	}

	private ArrayList<Employee> createEmpList() {
		Employee e1 = new Employee(1, 10);
		Employee e2 = new Employee(2, 20);
		Employee e3 = new Employee(3, 30);
		Employee e4 = new Employee(4, 40);
		Employee e5 = new Employee(5, 50);
		Employee e6 = new Employee(6, 60);
		Employee e7 = new Employee(7, 70);
		Employee e8 = new Employee(8, 80);
		Employee e9 = new Employee(9, 90);

		ArrayList<Employee> emp = new ArrayList<Employee>();

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);
		return emp;
	}
}
