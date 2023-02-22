package com.example.optionaldemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.optionaldemo.dto.Employee;
import com.example.optionaldemo.repository.OptionalRepository;

import java.util.Optional;

@RestController
public class OptionalClass {

    OptionalRepository repository;         // dependency invesion

/* Optional.of():- Does throw exception(NullpointerException) when input / string value not found.
 * When we are very sure that the reference object does not have null then we create object with Optional.of() method.
 * If reference object has null then with Optional.of() method it will throw the "NullPointerException" exception.
 * Example: Case 1: Given below  
 */    

    @GetMapping(path = "/id/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Optional<Employee> e = repository.findById(id);
        if (!e.isEmpty()) {
            Optional<String> name = Optional.of(e.get().getName());
            if (name.isPresent()) {
                return new ResponseEntity<>(e.get().getName().toUpperCase(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Name is null", HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity<>("Sorry! Employee with given ID is not present", HttpStatus.NOT_FOUND);
    }
    
/* Optional.ofNUllable():- does not throw exception(NullPointerException) instead return simple empty optional object.
 * When we are not sure that the reference object may have null or may not have null then we create object with Optional.ofNullable() method.
 * If reference object has null then with Optional.ofNullable() method we won't get NullPointerException exception instead
 * we can return a simple message saying that "The employee name is null" OR "Employee name does not exist with given id".
 * Example:Case 2: Given below  
 */    
    @GetMapping(path = "/id/{id}")
    public ResponseEntity<?> findByEmployeeId(@PathVariable Integer id) {
        Optional<Employee> e = repository.findByEmployeeId(id); // 15 as input which does not exist in database table.
        if (!e.isEmpty()) { // condition get true as we are passing 15 as value but by adding !(not) it
                            // works opposite.
            Optional<String> name = Optional.ofNullable(e.get().getName());
            if (name.isPresent()) {
                return new ResponseEntity<>(name.get().toUpperCase(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Name is null", HttpStatus.NOT_FOUND);
            }
        } else
            return new ResponseEntity<>("Sorry! Employee with given ID is not present", HttpStatus.NOT_FOUND);
    }


    
/* The isEmpty() method checks whether a string is empty or not. This method returns true if the string is empty (length() is 0), and false if not.
 * Example: 
 * String myStr1 = "Hello";
    String myStr2 = "";
    System.out.println(myStr1.isEmpty()); -- false
    System.out.println(myStr2.isEmpty()); -- true
    The isEmpty() method checks whether a string is empty or not.

This method returns true if the string is empty (length() is 0), and false if not.
Syntax
public boolean isEmpty()
Parameters: None.

Technical Details
Returns:A boolean value: true - The string is empty (length() is 0)
                         false - The string is not empty

 * What is isPresent () in Java?
 * The isPresent() method of java.util.Optional class in Java is used to find out if there is a value present in this 
 * Optional instance. If there is no value present in this Optional instance, then this method returns false, else true.                        
 */

 /* What is ifPresent() in Java?
  * The ifPresent method of the Optional class is an instance method that performs an action if the class instance contains
  * a value. This method takes in the Consumer interface's implementation whose accept method will be called with the value
  * of the optional instance as the parameter to the accept method.
  * 
  Optional<User>.ifPresent() takes a Consumer<? super User> as argument. You're passing it an expression whose type is void. 
  So that doesn't compile. A Consumer is intended to be implemented as a lambda expression:
  Optional<User> user = ... 
  user.ifPresent(theUser -> doSomethingWithUser(theUser));
  */ 

  /* Conditional Action with ifPresent(): The ifPresent() method enables us to run some code on the wrapped value if it's 
   * found to be non-null. 
   * Before Optional, We'd do: if(name! = null) { System.out.println(name.length());}
   * So what is we forget to check the condition for null value?
   * This could throw a NullPointerException at runtime. So Optional make us deal with nullable value explicitly as a way of 
   * enforcing good programming practice.
   * So till now we used a lot of if-else condition, instead we can do below 
   * name.ifPresent() - Now it takes consumer. What consumer? - It takes lambda expression so 
   * name.ifPresent( name -> System.out.println("Name is present: " + name));
   */

   //Example: Case 2: Instead of writing line 106-110 we can write in single line.  
     @GetMapping(path = "/id/{id}")
   public ResponseEntity<?> findByEmpId(@PathVariable Integer id) {
       Optional<Employee> e = repository.findByEmpId(id);
       if (!e.isEmpty()) {
           Optional<String> name = Optional.ofNullable(e.get().getName());

           /*
            * if (name.isPresent()) {
            * return new ResposeEntity<>(name.get().toUpperCase(), HTTPStatus.OK);
            * } else {
            * return new ResposeEntity<>("Name is null", HTTPStatus.NOT_FOUND);
            * }
            */
           name.ifPresent(n -> System.out.println("Name is present: " + n));
       } else
           return new ResponseEntity<>("Sorry! Employee with given ID is not present", HttpStatus.NOT_FOUND);
       return null;
   }
/* Example: Case 3: What if name is not present? Again this would fail. Again we have one more method ifPresentOrElse(null,null) */ 
/* So, */
// name.ifPresent()  --> This is consumer 
// name.ifPresentOrElse(null,null); --> This is Runnable.

        @GetMapping(path = "/id/{id}")
        public ResponseEntity<?> findByEmId(@PathVariable Integer id) {
        Optional<Employee> e = repository.findByEmpId(id); // 15 as input which does not exist in database table.
        if (!e.isEmpty()) { // condition get true as we are passing 15 as value but by adding !(not) it works opposite.
        Optional<String> name = Optional.ofNullable(e.get().getName());
        //name.ifPresent("Name is present: " + name); 
        name.ifPresentOrElse(n1 -> System.out.println("Name is present: " + n1), () -> System.out.println("Sorry! The name is not present"));   // Instead of writing line name.ifPresent("Name is present" + name); we can write this line.
        } else {
        return new ResponseEntity<>("Sorry! Employee with given ID is not present", HttpStatus.NOT_FOUND);
        } 
        return null;
    }
}

