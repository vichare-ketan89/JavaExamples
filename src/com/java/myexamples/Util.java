package com.java.myexamples;

import java.util.ArrayList;

public class Util {
	
	public static void printList(ArrayList<Employee> employees) {
		for(Employee employee : employees) {
			System.out.println("Name :: "+ employee.getName() + " Id :: "+ employee.getEmpId());
		}
		System.out.println("-----------------------------");
	}
	
	public static void printListWithRunnableName(ArrayList<Employee> employees, String runnableName) {
		for(Employee employee : employees) {
			System.out.println("Name :: "+ employee.getName() + " Id :: "+ employee.getEmpId() + " "+ runnableName);
		}
		System.out.println("-----------------------------");
	}
}
