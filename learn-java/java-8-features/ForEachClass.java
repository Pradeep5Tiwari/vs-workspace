import java.util.List;

/* Question: How to process the elements using forEach?
 * forEach() is a method.
 * All methods what we saw till now return something like min, max value, sorted collection, etc.
 * This method does not return anything?
 * Rather this method takes the lambda expresssion as an argument and supply that lambda expression to each element present
 * in that stream.   
 */
import java.util.*;
 import java.util.stream.*;

public class ForEachClass {
    
    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(5);
        arrList.add(10);
        arrList.add(15);
        arrList.add(25);
        arrList.add(30);
        Stream<Integer> streamObject = arrList.stream().filter(i -> i > 5);
        streamObject.forEach(x -> System.out.println(x));
    }
}
