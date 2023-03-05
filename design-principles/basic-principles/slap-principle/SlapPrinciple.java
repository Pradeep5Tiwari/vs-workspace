package DesignPrinciple;

public class SlapPrinciple {

	public static void getDetailsAndMails() {

		// Code to fetch the details from the database.
		System.out.println("Fetching the details from the database");
		String details = "Details";
		emailTheUser(details);

	}

	public static void emailTheUser(String details) {

		// Code to email the user
		System.out.println("Mailing to the user");
	}

	public static void main(String[] args) {
		
		getDetailsAndMails();
	}

}
