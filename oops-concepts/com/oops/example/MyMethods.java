package com.oops.example;


class Addition {
	
	public static int i = 1;
	public int findSum(int a, int b) {
		
		int sum = 0;
		sum = a + b;
		return sum;
		/*
		 * If you want to return the sum then you have to change the return type of
		 * method from void to int.
		 */	
		}
	public static int get() {
		
		return i++;
	}
}
public class MyMethods {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Addition obj = new Addition();
		int result = obj.findSum(10, 20);
		System.out.println("The sum is: " +result);
		System.out.println(Addition.get());
		System.out.println(obj.get());
	}

}
