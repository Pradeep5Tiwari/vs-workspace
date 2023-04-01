import java.util.function.Predicate;

/* Predicate
Question: What are predicate?
Answer: Predicate is a functional interface (Having only 1 single abstract method).
        The only abstract method of predicate is: Test(T t);
Example: public boolean test(T t);
Whenever you want to check for boolean condition then you can go for predicate.

Question: How to use predicate?
Answer: Say if you want to test if the length of string is greater or equal to 5 then in such situations where you need 
to test the condition then use test() method of predicate. 

Question: What is Type parameter and return type of Predicate?
Answer: The Type parameter or input to predicate can be just one like below
Predicate<String>
Predicate<Integer>
Predicate<Employee>
Predicate is generic type it accept only one input for checking boolean condition.

Imp: 
Return Type is not required as its always return "boolean" only.  

Question: What are the advantages of Predicate?
Answer: Code Reusability: The code reusability factor when we have seperate class where I am defining my string and test method to test the length
                          but we have Predicate<String> checklength which we may have in another class which contain the same condition like s->s.length >= 5 then we don't need to define the condition again.
        If you have same condition like (s->s.length() >= 5) being used 100 times in a program then you can write this just once and use it 100 times with checkLength.test("different string to be tested");           
        Conditonal check is hold by functional interface like Predicate<String> checkLength = s.s.length() >= 5

*/







public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        /*
         * PredicateFunctionalInterface predicateFunctionalInterface = new PredicateFunctionalInterface();
         * System.out.println("The Length Of String is: " + predicateFunctionalInterface.testStringLength("PredicateString"));
         */

        // Now using predicate
        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("The Length Of String is Greator than 5: " + checkLength.test("PredicateString"));
    }

    /*
     * public boolean testStringLength(String s) { // boolean method which will return true or false based on condition.
     * if (s.length() >= 5) {
     * return true;
     * } else {
     * return false;
     * }
     */
    // }

}
