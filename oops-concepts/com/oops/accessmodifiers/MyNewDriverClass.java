package com.oops.accessmodifiers;

public class MyNewDriverClass {

	public static void main(String[] args) {
		
		//MyStaticClass msObj = new MyStaticClass();
		System.out.println("Below using objectName which is not recommeded \t");
		/* msObj.display(); */     /*
							 * As this is the static method we are doing / calling using object
							 * reference. That is why its showing warning that display() method 
							 * is a static method and it should be access in in static way. however both using className 
							 * and objectName will work fine.
							 * 
							 * 
							 * So we should do it / call it by using class name which is MyStaticClass. So we should not create 
							 * object this above display() method 
							 */
		
		// Call the static method display() of MyStaticClass using className. Exxample below
		System.out.println("\n");
		System.out.println("Below using className which is recommeded");
		MyStaticClass.display();  // --> This is fine to access the static method using class name directly instead creating object. 
	}

}
