/* Question: How do you filter the stream objects?
 * Answer: Suppose we have 10 stream objects and we want to filter only those objects which are divisible by 2 or even so,
 * Example: Stream s = collectionObject.stream().filter(i -> i % 2 ==0);
 * 
*/

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterClass {

    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(4);
        arrList.add(5);
        arrList.add(10);
        arrList.add(15);
        arrList.add(20);
        arrList.add(25);
        arrList.add(35);
        arrList.add(45);
        arrList.add(55);
        arrList.stream().filter(i -> i % 2 == 0).forEach(s -> System.out.println(s));

        // Another example of filtering names from the list based on first letter.

        System.out.print("The filtered name starting with letter is: ");
        List<String> names = Arrays.asList("pradeep","tiwari","mit","geu","rishikesh","dehradun","Prateek");
        names.stream().filter(s->s.startsWith("p")).collect(Collectors.toList()).forEach(s -> System.out.println(s));
    }

}
