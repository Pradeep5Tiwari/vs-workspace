package DesignPrinciple;

public class KissPrinciple_InEfficient {
	
	private static String getMonth(int month) {
		
		switch(month) { 
		
		case 1: 
			return "January";
		case 2: 
			return "February";
		case 3: 
			return "March";
		case 4: 
			return "April";
		case 5:
			return "May";
		case 6: 
			return "June";
		case 7:
			return "July";
		case 8: 
			return "August";
		case 9:
			return "September";
		case 10:
			return "Octuber";
		case 11: 
			return "November";
		case 12: 
			return "December";
		default:
			throw new  IllegalArgumentException("Month Must Be In Range From 1 To 12");
		}
	}

	public static void main(String[] args) {
		
		String month = getMonth(12);
		System.out.println("Month is: " + month);
		
	}

}

/*
 * Above Code is in-efficient. There are many unnecessary line of code /
 * statement is written.
 * 
 * We will reduce these many line and will write the efficient code.
 */ 