/* Method Reference: is a replacement of lambda expressions. It's used to refer method of Functional Interface to
 * An existing method. Mainly it's used for code reusability. 
 * Functional Interface abstract method can be mapped to specific existing method using double colon :: operator. This is method reference.
 * Hence method reference is an alternative to lambda expresssion.
 * Whenever we have existing implementation of our abstract method of functional interface then we can go for method reference.
 * If no such implementation in existing class code then go with lambda expression.
 * In below code we are providing method reference using double colon :: following Test class reference 
 * As we have static method testImplmentation() which would be access using class name only also we have class "Test" 
 * Under which one static method "testImplementation()" which will be the replacement of abstract method which is defined in FunctionalInterface "FunctionalInterfaceExample" 
 */

public class MethodReference {

    public static void main(String[] args) {

        // If no test implementation exist then go for below lambda expression.
        /*
         * FunctionalInterfaceExample functionalInterfaceExample = () -> System.out.println("This is lambda expression implementation for functional interface abstract method");
         * functionalInterfaceExample.printAbstractMethod();
         */

        // If test implementation exist then go for below method reference.
        FunctionalInterfaceExample functionalInterfaceExample = Test::testImplementation;
        functionalInterfaceExample.printAbstractMethod();
    }
}

class Test {
    public static void testImplementation() {
        System.out.println(" This is the test implementaton for abstract method - printAbstractMethod(), \n Which is defined in functional interface - FunctionalInterfaceExample ");
    }
}