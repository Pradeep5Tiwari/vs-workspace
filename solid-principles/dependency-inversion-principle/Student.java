//package solid-principles.dependency-inversion-principle;

public class Student {
    private Address address;

    Student() {
        address = new Address(); // Tight Coupling as address creation is only after we provide Student() instantiated.
    }
}
/*
 * In above example the Student class is dependent on Address class as to create
 * the address using address object.
 * Untill we give Student() the address won't be created and tomorrow in future
 * there may be a n number of change in Address
 * class and if Student class is depends on Address class for creating address
 * then this Student class also need to be changed.
 * This makes tight coupling between Student and Address class.
 * 
 * To resolve this issue we would use dependency injection where Address class
 * will be implemented independenctly and
 * will be provided to the Student class only when the Student class
 * instantiated by using the Student() constructor OR
 * setter based dependency injection.
 */