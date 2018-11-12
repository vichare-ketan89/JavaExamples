package com.java.myexamples;

import java.util.ArrayList;

public class ThreadsMain {

	public void runThreadMethods(ArrayList<Employee> employees) {
		
		Thread firstThread = new Thread(new FirstRunnable(employees));
		Thread secondThread = new Thread(new SecondRunnable(employees));
		
		firstThread.setName("Thread A");
		secondThread.setName("Thread B");
		
		firstThread.start();
		secondThread.start();
	}

}
