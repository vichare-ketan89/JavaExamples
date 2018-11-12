package com.java.myexamples;

public class Employee implements Comparable<Employee>{
	private String name;
	private int empId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@Override
	public int compareTo(Employee o) {
		if(o.empId ==  empId) return 0;
		else if(o.empId < empId) return 1;
		else return -1;
	}
	
	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
}
