package com.basicstrong.business;

public abstract class Department {
	
	
public abstract int getEmployee();

public abstract void method();

public void attendance() { /*
							 * Given here is a concrete method
							 * "attendence() which has implementation inside abstract class - Department."
							 */	 
	System.out.println("This is the concrete method is present");
	}

}


class ChildDepartment extends Department {

	@Override
	public int getEmployee() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("This is implementation of parent abstarct method");
	}
	
	/*
	 * After this we need to create one more driver class where we will create the object of
	 * ChildDepartment class and then access the getEmployee() method.
	*/	
}
