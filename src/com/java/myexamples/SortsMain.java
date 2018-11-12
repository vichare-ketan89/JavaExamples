package com.java.myexamples;

import java.util.ArrayList;
import java.util.Collections;

public class SortsMain {

	public void runSortMethods(ArrayList<Employee> employees) {
	
		Collections.sort(employees);
		
		Util.printList(employees);
		
		Collections.sort(employees, new EmployeeComparator());
		
		Util.printList(employees);
		
	}
	
}
