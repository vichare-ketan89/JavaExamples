package com.java.myexamples;

import java.util.ArrayList;

public class EmployeeMain {
	
	private static ArrayList<Employee> init() {
		Employee e1 = new Employee("A",101);
		Employee e2 = new Employee("B",306);
		Employee e3 = new Employee("C",201);
		Employee e4 = new Employee("D",81);
		Employee e5 = new Employee("E",201);
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		return employees;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = init();
		
		//Sort sample
		SortsMain sortsMain = new SortsMain();
	//	sortsMain.runSortMethods(employees);
	
		//Thread Test
		ThreadsMain threadsMain = new ThreadsMain();
		threadsMain.runThreadMethods(employees);
	}
	
	

}
