package com.java.myexamples;

import java.util.ArrayList;

public class FirstRunnable implements Runnable{
	
	private ArrayList<Employee> employees;
	
	public FirstRunnable(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public void run() {
		Util.printListWithRunnableName(employees, "Runnable 1");
	}
}
