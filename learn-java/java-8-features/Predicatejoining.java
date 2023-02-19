import java.util.function.Predicate;

/* Question: What is predicate joining?
Answer: If we have multiple different predicate reference and if we want to combine them instead writing && condition then we combine predicate in serial predicate. 

There are three ways to join predicate like: and,or,negate 
and - It works with 2 predicate by combining 
or - It works with 2 predicate by combining
negate - It works with only 1 predicate as shown below in example.

Example: If you want to check two condition where
1) String length should be greator than 5 and 
2) String length is even */

public class Predicatejoining {

    public static void main(String[] args) {

        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("The Length of String is: " + checkLength.test("Pradeep")); // Predicate1 = true 

        Predicate<String> checkEven = s -> s.length() % 2 == 0;
        System.out.println("The length of string is: " + checkEven.test("pradeep")); // Predicate2 = fasle

        // Now we want to combine these two predicate condition into one using
        // And,Or,Negate

        System.out.println("After combining two predeicate with .and the result is: "
                + checkLength.and(checkEven).test("pradeep"));

        System.out.println(
                "After combining two predicate with .or the result is: " + checkLength.or(checkEven).test("pradeep"));

        System.out.println(
                "After combining two predicate with .negte the result is: " + checkLength.negate().test("pradeep"));

    }

}
