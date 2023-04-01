package com.oops.accessmodifiers;

public class MyStaticClass {
	
	static int a = 10; /*
						 * These static variables are class variables which get memory only once in the
						 * class area at the time of class loading.
						 */	
	
	static void display() {
		
		System.out.println("The value for static variable is: " +a);
	}

}
