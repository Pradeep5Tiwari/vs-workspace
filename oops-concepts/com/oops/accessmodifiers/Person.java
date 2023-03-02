package com.oops.accessmodifiers;

public class Person extends AccessModifier { /*
								Now the Person class is the child class of Parent AccessModifier
										    */
	
	public static void main(String[] args) {
		
		AccessModifier accessModi = new AccessModifier();
		accessModi.enrollEmployee("Pradeep");
		
		Person p = new Person();
		p.enrollEmployee("Tiwari");    
		
		AccessModifier accessModifier = new Person();
		accessModifier.enrollEmployee("Alok");

		//Person person = new AccessModifier();
		//person.enrollEmployee("koti");          // This would throw the exception as child class Person can't hold the parent reference.
		
		//AbstractDemo absDemo = new AbstractDemo(); //Important: We cannot create an object of abstract class.
	}
	/*
	 * If the child class (Person) extends Parent class(AccessModifier) and is
	 * present within the same package (accessmodifiers) then you can access the
	 * protected method (enrollEmployee) of Parent class(AccessModifier) using both Parent and Child class reference.
	 */
}
