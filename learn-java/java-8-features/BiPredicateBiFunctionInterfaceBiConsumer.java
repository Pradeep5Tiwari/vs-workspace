/* Question: We have BiPredicate, BiFunction, BiConsumer but why not BiSupplier?
 * Answer: We know that Predicate,Function and Consumer all three take input whatever no of argument but we know that 
 * Supplier does not take any input but only and always return the output which is return type.
 * Also all three are related to taking something input which is single(1) input but supplier doe not take any input at all
 * So BiPredicate, BiFunction and BiConsumer talks about taking two(2) input. 
 * 
 * Till now we had below 
 * Predicate<T> --> test() --> return boolean always
 * Function<T,R> --> apply() --> return result type
 * Consumer<T> --> accept() --> return nothing it just accept.
 * Supplier<R> --> get() --> return only output as return type amnything.
 * 
 * Question>:So till now we are taking only 1 input but what if we need two argument?   
 * Answer: So, to fulfill two argument need we need BiXYZ functional interfaces.
 * 
 * There is not input in supplier so no 1 or 2 input argument needed. Hence no BiSupplier. 
 */

 /* Note: BiConsumer is understood easily as it just accept one input and does not return anything.

 * Question: If we want to operate on 3 arguments then do we have 'triPredicate'?
 * Answer: There is no TriPredicate OR TriFunction OR TriConsumer etc.
 * No QuadPredicate OR QuadFunction OR QuadConsumer
 * Java 8 has functional interface that can only take two(2) arguments not more. 
 
*/

import java.util.function.*;
 public class BiPredicateBiFunctionInterfaceBiConsumer {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> sumOfTwo = (a,b) -> a+b >= 5;
        System.out.println("The sum of two number using BiPredicate is: " + sumOfTwo.test(5,2));
        System.out.println("The sum of two number using BiPredicate is: " + sumOfTwo.test(2,1)); 

        BiFunction<Integer,Integer,Integer> multiplyOfTwo = (a,b) -> a*b;
        System.out.println("The Multiplication of two number using BiFunction is: " + multiplyOfTwo.apply(15, 10));

        BiConsumer<Integer,Integer> sumOfTwoNum = (a,b) -> System.out.println("The sum of two number using BiConsumer is: " + (a+b));
        sumOfTwoNum.accept(10, 20);
        //System.out.println("The sum of two number is: " + sumOfTwoNum.apply(10,10));

     /* Note: Hence we are not printing 'sumOfTwoNum' as it does not return anything it just accept as it has only accept method 
      * and it(BiConsumer) does not have apply method. so we have commented it out. Though if you try to uncomment above line
      * and print using 'apply' method then it should show error on 'apply' method saying that 'apply' method is undefined
      * for the BiConsumer interface.  
      * Ther is difference b/w printing: System.out.println("The sum of two number using BiConsumer is: " + a+b)); --> This is allowed AND 
      * System.out.println("The sum of two number is: " + sumOfTwoNum.apply(10,10));  --> This is not allowed  
     */
    }
 }