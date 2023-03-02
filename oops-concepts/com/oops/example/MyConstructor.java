package com.oops.example;

public class MyConstructor {
	
	private int a;
	
	/*  Default Constructor
	 * Public MyConstructor() { 
	 * System.out.println("Default Constructor"); 
	 * } 
	 * This Constructor will be called when we don't define any constructor at the time
	 * of object creation in main class using class name.
	 */ 
	
	
	
	// Non-Parameterized Constructor
	public MyConstructor() {
		a = 10;
		System.out.println("The Non-Parameterized Constrcutor");
	}
	
	// Parameterized Constructor
	
	public MyConstructor(int a) {
		
		this.a = a;
	}
	
	public void getConstructor() {
		
		System.out.println("The value is: " +a);
	}

	public static void main(String[] args) {
		
	//MyConstructor obj = new MyConstructor();
	MyConstructor obj2 = new MyConstructor(20);
	//obj.getConstructor();
	obj2.getConstructor();

	}

}
