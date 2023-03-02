package com.basicstrong.business;

public class DepartmentDriver {

	public static void main(String[] args) {
	
		ChildDepartment cdObj = new ChildDepartment();
		int employee = cdObj.getEmployee();
        System.out.println("Department has " +employee+" employees");
        
		cdObj.attendance(); /* Since we created the concrete method in Department abstract class
		                       We can access that concrete method here as well */
	}

}
