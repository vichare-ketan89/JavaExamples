package com.java.myexamples;

import java.util.ArrayList;

public class SecondRunnable implements Runnable{
	
	private ArrayList<Employee> employees;
	
	 public SecondRunnable(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public void run() {
		Util.printListWithRunnableName(employees, "Runnable 2");
	}
}
