
/* Question: What is Functional Chaininig? 
Answer: Like we have predicate joining similiarly we have functions joining. 
So If we have thousands of functions then we are not going to add && thousands time but we can chain multiple 
functions together using 2 ways.

There are two ways to combine the functions.
f1.andThen(f2).apply(input); - first f1 then f2
f1.compose(f2).apply(input) - first f2 then f1 

Multiple functions can be chain together like: 
f1.andThen(f2).andThen(f3).andThen(f4).apply(inputs);

*/
import java.util.function.*;

public class FunctionChaining {

    public static void main(String[] args) {

        Function<Integer, Integer> doubleIt = number1 -> number1 * 2;     
        System.out.println("The double of number is: " + doubleIt.apply(2));   // doubleIt = 4

        Function<Integer, Integer> cubeIt = number1 -> number1 * number1 * number1;
        System.out.println("The cube of number is: " + cubeIt.apply(2));  // cubeIt = 64  

        // Function Chaining
        System.out.println("First doubling using apply(): " + doubleIt.andThen(cubeIt).apply(2)); // first doubleIt then cube it so 2*2=4=4*4*4=64
        System.out.println("First Cubing using the compose(): " + doubleIt.compose(cubeIt).apply(2)); // first compose it then dopubleIt so 2*2*2=8*2=16 
    }
}
