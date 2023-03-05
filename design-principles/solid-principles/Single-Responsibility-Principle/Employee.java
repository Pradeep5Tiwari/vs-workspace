public class Employee {

    private int id;
    private String name;
    //Address address;          // we can declare Address class dependency for state field here.

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printMe() {
        System.out.println("Employee ID is " + this.id + "Employee name is: " + this.name);
    }

}

/* Single Responsibility Principle: - Let's suppose we have Employee class and we want to add / change the 'state' 
 * field of an employee then what would you do? We cannot change the Employee class as it's alreay having two object like id and name 
 * but we need to add / create the state field which would be inside the Address class and first this Address class need 
 * to be created.
 * So lets crate the Address class and crate its fields like address first,second line and then city,state and country.
 * And then finally access it in Employee class. By using this way it won't affect the Employee class directly.  
 */