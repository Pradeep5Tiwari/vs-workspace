/* Question: How to prcess the element using count()?
 * Answer: If we want to count that how many elements are there to satisfy the given condition then use count() method.
 * 
 */
import java.util.*;
import java.util.stream.*;

public class CountClass {

    public static void main(String[] args) {

        List<Integer> myNumList = new ArrayList<>();
        myNumList.add(10);
        myNumList.add(20);
        myNumList.add(30);
        myNumList.add(40);
        myNumList.add(50);

        Stream<Integer> streamObject = myNumList.stream();
        Stream<Integer> filterStreamObject = streamObject.filter(n -> n > 30);
        long countFilterStrObject = filterStreamObject.count();
        System.out.println(countFilterStrObject); 

        System.out.println("Now print in single line to optimize above code: ");
        long longCountfilterElement = myNumList.stream().filter(i -> i>20).count();
        System.out.println(longCountfilterElement);

        // even you can apply count() method on row stream without filter like given below.
        System.out.println("Even you can apply count() method on row stream.)");
        long countElement = myNumList.stream().count();
        System.out.println(countElement);
    }
}
