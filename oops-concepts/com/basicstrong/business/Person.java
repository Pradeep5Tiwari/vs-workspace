package com.basicstrong.business;

import com.oops.accessmodifiers.AccessModifier;

public class Person extends AccessModifier {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		AccessModifier accessModi = new AccessModifier();
		//accessModi.enrollEmployee("Prdeep Tiwari"); // Error cause is given below
		/*
									 * This person class (Child) of business package throw error in the case if we try to
									 * access the protected method of AccessModifier class(Parent) which is insider
									 * access modifiers package even when we extends the AccessModifier class because
									 * we cannot access the protected members outside the package in it�s child
									 * class with parent reference.
									 */
		
		
		/*
		 * #So if you want to access the protected method in it's sub-class that is
		 * present outside the package then we can access them with only child class
		 * reference. #If we use protected method in different class but within the same
		 * package then we may use any reference to call those method. It can be child
		 * OR parent
		 */
		
		Person p = new Person();
		p.enrollEmployee("Tech Mahindra");/*
		 * Protected methods "enrollEmployee() of Parent class ( AccessModifier) can
		 * be access via Child class (Person) reference(p) only.
		 */	}

}
