package OOPS;


class BankAccount {
	
	private double balance = 1000000;             /* Here all of these data members made private for data hiding */
	private String userName = "Pradeep Tiwari";
	private String password = "password";
	
	public double getWalletBalance(String userName, String password) { 
		
		if(this.userName.equals(userName) && this.password.equals(password)) {
			
			return balance;
		}
		else {
			return 0.0;
		}
	}
}



public class AccessAccount {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		System.out.println("The Balance is:"
				+ acc.getWalletBalance("Pradeep Tiwari", "password")); /* So this is how we can access the balance.
				 														* But if i provide wrong userName and password 
				 														* here then it won't return the actual balance
				 														* but will print just 0.0 of else part in condition given above */

	}

}
