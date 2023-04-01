package DesignPrinciple;

public class KissPrinciple_Efficient {

	private static String getMonthName(int month) {

		if ((month < 1) || (month > 12)) {

			// System.out.println("");
			throw new IllegalArgumentException("The Month Must Be In A Range of 1 To 12");
		} else {

			String[] months = { "January", "February", "March", "April", "May", "June", "July", "Auguest", "September",
					"October", "November", "December" };
			return months[month - 1];
		}
	}

	public static void main(String[] args) {

		System.out.println(KissPrinciple_Efficient.getMonthName(10));
	}

}

/*
 * The role of adding static before any entity is to make that entity a class
 * entity. It means that adding static before methods and variables make them
 * class methods and class variables respectively, instead of instance methods
 * and instance variables.
 * 
 * Hence, static methods and variables can be directly accessed with the help 
 * of Class, which means that there is no need to create objects in order to 
 * access static methods or variables. 
 */