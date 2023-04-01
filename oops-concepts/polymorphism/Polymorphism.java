package OOPS;

class Addition {

	public void sum(int a, int b) {
		System.out.println("Sum is " + (a + b));
	}

	public void sum(double a, double b) {
		System.out.println("Sum is " + (a + b));
	}

	public void sum(int a, int b, int c) {
		System.out.println("Sum is " + (a + b + c));
	}
	
	public void sum(float a, float b, float c, float d) {
		System.out.println("Sum is " + (a + b + c));
	}

}

public class Polymorphism {

	public static void main(String[] args) {

		Addition obj = new Addition();
		obj.sum(10.50, 20.20);
		obj.sum(10, 20);
		obj.sum(10, 10, 30);
		obj.sum(10f, 20f, 30f, 10f);
		
		/*
		 * Method selection will be chosen by compiler based on the argument we passed
		 * depend on type and number of argument.
		 */

	}

}