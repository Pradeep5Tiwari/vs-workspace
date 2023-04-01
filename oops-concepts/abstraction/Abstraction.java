package OOPS;

import java.util.ArrayList;

interface Mobile {

	public void calling(String number);

	public void sendMEssage(String message);

}

class Apple implements Mobile {

	private ArrayList<String> contacts = new ArrayList<String>();

	public void addContacts(String number) {

		contacts.add(number);
	}

	@Override
	public void calling(String number) {

		System.out.println("Calling..." + number);
	}

	@Override
	public void sendMEssage(String message) {

		System.out.println("Sending Message... " + message);

	} /*
		 * class "Apple" implements "Mobile" interface so, that it can inherit the
		 * functionalities of Mobile interface.
		 */

}

public class Abstraction {

	public static void main(String[] args) {

		Apple myApple = new Apple();
		myApple.calling("9875645365");
		myApple.sendMEssage("Hello");
		myApple.addContacts("9984654234");

		Samsung myNewPhone = new Samsung();
		myNewPhone.calling("8798094040");
		myNewPhone.sendMessage("Hi there?");
	}

}
/*
 * Abstraction using abstract class example Let's create an abstract class
 */

abstract class Mobiles {

	ArrayList<String> contacts = new ArrayList<String>();

	abstract void calling(String number);

	abstract void sendMessage(String message);

	public void addContact(String contact) {

		contacts.add(contact);
	}

}

class Samsung extends Mobiles {

	@Override
	void calling(String number) {
		System.out.println("Calling..." + number); // Implementation

	}

	@Override
	void sendMessage(String message) {
		System.out.println("Sending Message..." + message); // Implementation

	}

}