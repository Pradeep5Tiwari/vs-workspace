/* Default Method: is a way for adding new methods to the interface without affecting the implementing classes
 * Hence with this new features java people defended many compile time errors that may arise due to unimplemented methods of interface.
 * Example: 
 * interface DefaultInterface { 
 * void defaultMethod() { 
 * System.out.println("Default Method");
 * }
 * }
 * The use of these default method is "Backward Compatibility" which means if JDK try to modify the interface (without default method) 
 * then the class which implementing this interface will break.    
 * On other hand if you add the default method in an interface then you will be able to provide the default implementation and this won't affect the implementing classes.
 * 
 * Question: Is it necessary to override the default method?
 * Answer: default method have default implementation and if implementing class is okay with this implementation then don't override it.
 * Otherwise if implementing class is not okay this the default implementation then can override and provide their own implementation.
 * 
 * Question: Is default keyword one of the access modifier? 
 * Answer: default is not the acesss modifier like public provate and protected. 
 * 
 * Question: For default access modifier we do not use any modifier.
 * Answer: Hence default keyword was only used in classes till 1.8 version for switch case only but never in interface.
 * Now it's used for default method in interface to provide default implementation for all implementing classes.
 * So, default is not the access modifier but its only used to provide the default implementation of method in an interface for implementing classes. 
 * 
 * Question: Can we use hasCode default implementation in interface?
 * Answer: i)  you cannot use default implementation of hasCode in interface all all implementing classes.
 *         ii) we are not allowed to use object class method as default methods in interface else will get compile time error.
 *         iii) All the implementing classes has access to all methods of object class by default.
 * 
 * Question: How default method in interface cope up with Diamond problem?
 * Answer: Lets disscuss first the Diamond Problem: Diamond Problem occurs in java due to multiple inheritance so if one class is extending / inheriting two classes and both of these two classes have some common method then this child class will actually have which method as its own.
 * So it will be consfused between this parent1 and parent2. So that is the Diamond Problem. 
 * 
 * Then that was introduce with interface. Interface never had implementation before java 1.8.
 * In java such situation(Diamond Problem) the code will not compile.
 * Solution to diamond problem: use InterfaceName.super.MethodName();
 *     
 */

public interface DefaultMethod {

    // void printAbstractMethod();
    default void defaultMethod() {
        System.out.println("This is the default method of DefaultMethod interface");
    }

    /* default int hashCode() {
        return 2 * 3; // This is not the right practice because hasCode() must return one unique
                      // primery instead 6 becasue this is just for demo purpose.
    }
 */
}
