package com.oops.accessmodifiers;

public final class NonAccessModifer {   // Here class declared as final. 
	
	
	final int a = 5;
	
	protected void myMethod() {
		
		//int b = 10;
		System.out.println("This is Public Method");
		//a = 10;
		/*
		 * Here in line number 12 --> we will get the error as we have already declared a as final variable
		 * which has 5 and now again we cannot assign 10 value to it.
		 */	}
	
	public final void myMethod2() {
		
		System.out.println("This is my final method");
	}

}

//class NonAccessModifier2 extends NonAccessModifer { /* Here since the parent class is final we cannot extends it. */
	
	//public void myMethod2() {      /*This is throw the error because we cannot override or change the implementation of final method - myMethod2() in child class which extends the parent class and trying overriding method of its  */
		
		//System.out.println("This is child class of final method  "); 
	//}
//}
