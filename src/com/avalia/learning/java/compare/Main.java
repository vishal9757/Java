package com.avalia.learning.java.compare;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(5, "Rahul","CS");
		Employee e2 = new Employee(7, "Vishal","IT");
		Employee e3 = new Employee(1, "Ankur","Web");
		Employee e4 = new Employee(9, "Vibhav","CSIT");
		
		ArrayList<Employee> al =new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al);//,new DeptComparator());
		
		for (Employee employee : al) {
			System.out.println(employee);
		}
	}

	
	
}
