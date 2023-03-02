package com.designpattern.creational;

public class Coffee {

	int coffeeId;
	String coffeeName;

	public int getCoffeeId() {
		return coffeeId;
	}

	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	@Override
	public String toString() {
		return "Coffee [coffeeId=" + coffeeId + ", coffeeName=" + coffeeName + "]";
	}

}


/*
 * Why we write toString() method in Java? 
 * 
 * The toString() method returns the
 * string representation of the object. If you print any object, java compiler
 * internally invokes the toString() method on the object. So overriding the
 * toString() method, returns the desired output, it can be the state of an
 * object etc.
 */