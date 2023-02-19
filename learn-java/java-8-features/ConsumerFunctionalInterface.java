/* Question: What is consumer functional interface?
 * Answer: Predicate<T> - take 1 input and return boolean.
 *         Function<T,R> - take 1 input and 1 return type produced after performing some operation on that input.
 *         Consumer<T> - it's also a "predefined functional interface" it just take just 1 input consume it and never return anything.
 * It has only one method called accept();
 * Example: Consumer just take 1 object and save its details on database and don't return anything.
 * Interface Consumer<T>
 * public void accept(T t);
 *
 */
import java.util.function.*;
 public class ConsumerFunctionalInterface {

    public static void main(String[] args) {

        // if consumer interface is not available then using traditional way
        /* ConsumerFunctionalInterface consumerFunctionalInterface = new ConsumerFunctionalInterface();
        consumerFunctionalInterface.squareMeMethod(4); */

        // using consumer interface
        Consumer<Integer> squareMe = number -> System.out.println("Taking input and performing square operation and returning nothing " + number * number);
        squareMe.accept(5);
    }

    /* public void squareMeMethod(int n) {
        int squareNumber = n * n;
        System.out.println("The square of the given number is: " + squareNumber);
    } */
 }
