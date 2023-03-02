package OOPS;

class AccountInfo {

	private double balance; // private data member = data hiding

	public double getBalance() { /*
									 * Member function to get balance or to access private data member balance
		validation before returning the balance							 */
		return this.balance;
	}

	public void setBalance(double balance) { // Member function to set the balance

		this.balance = balance;
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		AccountInfo acc = new AccountInfo();
		acc.setBalance(500000);
		System.out.println("The balance is " + acc.getBalance());
	}

}