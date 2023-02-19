import java.util.function.BiConsumer;

/* Lambda Expression: Lambda expression is a anonymous function.
Without name, return type and access modifier and having one lambda symbol -> 

Example: 
// before java 8 how we used to print the statement. 
    public static void add(int a, int b) {
        System.out.println(a+b);
    }

// After Java 8 lambda expression    
(a,b) -> System.out.println(a+b);

So we reduced 3 line of code into just 1 line of code. 

BiConsumer: is a predefined functional interface which accept two integer and return nothing.
BiConsumer functional method is accept(Object, Object). 
*/

//package java-8-features;

public class LambdaExpression {

    /*
     * public void add(int a, int b) {
     * System.out.println(a+b);
     * }
     */
    public static void main(String[] args) {

        /*
         * LambdaExpression lambdaExpression = new LambdaExpression();
         * lambdaExpression.add(10, 30);
         */

        // Below we have written the lambda expresssion which is reducing 5 line of code
        // into just 2 line of code.
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(30, 20);
        /*
         * Since type "Integer" is inferred from BiConsumer interface
         * (BiConsumer<Integer, Integer>) so it's known to compiler and that is why we
         * have removed "Integer" from (a, b)
         */
    }

}
