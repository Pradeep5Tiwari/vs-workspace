/* Question: What is consumer chaining?
 * Answer: We can combine / merge chain of multiple consumers together with "andThen".
 * There is only one way to combine the consumers. 
 * Example: c1.andThen(c2).accept(input); --> First c1 then c2 
 * No compose() in consumer.
 * Multiple consumers can be combine / chained together like c1.andThen(c2).andThen(c3).andThen(c4).apply(inputs);
 * 
 * Question: What would happen if we use compose() method for these consumer squareMe and doubleMe?
 * Answer: This would give error because 'compose' does not exist in Consumer interface. (in last commented line below)
 * 
 *  */
import java.util.function.*;

public class ConsumerChaining {

    public static void main(String[] args) {

        Consumer<Integer> squareMe = number -> System.out.println("Taking input and performing square: " + number * number);
        squareMe.accept(5); 

        Consumer<Integer> doubleMe = number -> System.out.println("Taking input and performing double operation: " + number * 2);
        doubleMe.accept(5);

        // Now using .acceptThen() of consumer
        squareMe.andThen(doubleMe).accept(4);
        // squareMe.compose(doubleMe).accept(4);
    }
}
