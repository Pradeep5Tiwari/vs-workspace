package OOPS;

// Single Inheritance

class A {     // So, class 'A' is a parent class of class B;
	
} 

class B extends A {    // Child class 'B' which extends parent class 'A';
	
}                     // Level 1 = From class A to Class B extends A

// Multilevel Inheritance

class C extends B {
	
}                   // Level 2 = From class B extends A _To_ class C extends B 

// Multiple Inheritance:  More than one parent

interface AA {
	
	default void method() {
		System.out.println("Default method of interface AA");
	
}

interface AAA {
	
	default void method() {
		System.out.println("Default method of interface AAA");
	}
}

class BB extends A implements AA, AAA {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		AA.super.method();
	}
}
		/* It's necessary to override the method 
		 * --> using interface name "AA" then using "super" keyword and then method
		 * name we tell the compiler that which implementation to took to avoid
		 * ambiguity
		 */	 
								/*
								 * Since we are implementing AA and AAA interface in class BB
								 * start throwing error until we override these default method  
								 * which are with same name. So, we will override them 
								 * 
								 */	
	
								/*
								 * In above if i want to pick the another implementation then simply change the
								 * interface from AA to AAA. like AAA.super.method;
								 */ 
}
 
//Hierarchical inheritance



public class Inheritance {

	public static void main(String[] args) {
		

	}

}