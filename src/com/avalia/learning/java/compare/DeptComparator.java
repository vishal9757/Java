package com.avalia.learning.java.compare;

import java.util.Comparator;

public class DeptComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDept().compareTo(o2.getDept());
		
	}

}
