package OOPS;

import java.util.ArrayList;
import java.util.List;

class College {
	
	String name;
	private List<Teacher> teacher;
	
	public College(String name, List<Teacher> teacher) {
		
		this.name = name;
		this.teacher = teacher;
	}
	
	public List<Teacher> getTeachers() {
		return teacher;
	}
}

class Teacher {
	
	String name;
	String subject;
	public Teacher(String name, String subject) {
		
		this.name=name;
		this.subject=subject;
	}
	
	@Override
	public String toString() {
		
		return "[Teacher : "+name+", Subject : "+subject+"]";
	}
}
public class Aggregation {

	public static void main(String[] args) {
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("Pradeep", "Java"));
		teachers.add(new Teacher("Tiwari", "OOPS"));
		System.out.println("The Teachers and subjects are: " +teachers);
		
		
		College college = new College("GEU", teachers);
		System.out.println(college);
		/*
							 * Here we are passing the "Teacher" class object --> teachers to the College
							 * class. So hence it's called aggregation. 
							 */
	}

}
