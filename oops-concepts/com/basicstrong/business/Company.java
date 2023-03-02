package com.basicstrong.business;

import java.util.Calendar;
import java.util.Date;

public class Company {
	
	@SuppressWarnings("unused")
	private String empEmailId = "pradeep.tiwari555@gmail.com";

	public static void main(String[] args) {
		
		System.out.println("Below 'Date' and 'Calendar' class will print the same result");
		
		
		Date myDate = new Date();
		System.out.println(myDate);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());  // This will print the current date and time.
		
		

	}

}
