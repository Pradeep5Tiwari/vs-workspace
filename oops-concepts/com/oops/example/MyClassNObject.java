package com.oops.example;

/*Below we will create a class because one java source file can have multiple class but only one public class.*/

class Fan { /*
			 * Here the type of Fan class would be "default" as we didn't given any access modifier
			 */	
	public boolean isOn;     // Instance variable
	public static int staticVar;
	
	public void get() {
		staticVar++;
	}
	public void turnOn() {
		//int var = 0;          // local variable and it get initialized whenever we call this method turnOn. We never define local variable with access modifier because scope of local variable is already defined within method body.
		isOn = true;
		//System.out.println("Fan is spinning");
	}
	
	public void turnOff() {
		
		isOn = false;
		//System.out.println("Fan is stop");
		//System.out.println(var);    // This local variable "var" of turnOn method won't be accessible outside it's method. Hence will throw error
	}
	
	public void checkFinalStatus() {
		
		if(isOn)
		{
			System.out.println("The Fan is ON");
		}
		else 
		{
			System.out.println("The Fan is OFF");
		}
	}
	
}
public class MyClassNObject {

	public static void main(String[] args) {
		
		Fan myFan1 = new Fan(); /* Here we are creating the object using "new operator / keyword" - myFan is class reference variable/object */
		Fan myFan2 = new Fan();
		//myFan.isOn();
		//myFan.isOff();
		myFan1.turnOn();
		myFan1.checkFinalStatus();
		myFan2.turnOff();
		myFan2.checkFinalStatus();
		System.out.println(myFan1.isOn);
		System.out.println(Fan.staticVar);    // Accessing static variable using two 1. Class and 2. Object reference will share only '0' value
		//System.out.println(myFan2.staticVar);
		//myFan1.get(); //0 --> 1 
		//System.out.println(myFan2.staticVar);
	
		
	}

}

/*
 * # How to define a class. # How to create a object using new operator # How to
 * access member function or method. # What is a state of an object. # We can
 * have many classes in java with only one public class.
 * # Always remember that class name should be saved with the main class name or the class which is "public" not any other class name like "private", "default"
 */
