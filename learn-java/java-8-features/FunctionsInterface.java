/* Functions:
 * Function is also a predefined functional interface (Having only 1 abstract method)
 * The only abstract method of Fucntion is apply(T t);
 * R apply(T t);
 * Given some input and we perform some operation on given input and then produce / return result.(not necessary a boolean value) 
 * This takes one input and and returns one output.
 * In predicate we take one input and always return boolean. 
 * In Function the rerturn type is not fixed hence we declare both input type and output return type.
 * Example: Function<Integer, Integer>: Here first Integer is input type and second Integer is return output type. 
 */

import java.util.function.Function;

public class FunctionsInterface {

    public static void main(String[] args) {

        /* FunctionsInterface functionsInterface = new FunctionsInterface();
        System.out.println("The Square of 5 is: " + functionsInterface.squareTheNumber(5)); */ // Traditonal way
    
    // Using Function interface
    
      Function<Integer, Integer> numberSquare = n -> n * n;
      System.out.println("The square of 5 is: " + numberSquare.apply(5));  // Modern way using Function interface.
    
    }    
    /* public int squareTheNumber(int n) {

        int square = n * n;
        return square;
    } */

}
