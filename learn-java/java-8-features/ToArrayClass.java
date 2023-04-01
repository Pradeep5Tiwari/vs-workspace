/* Question: How to process the elements using toArray()?
 * Answer: We can use this method to copy the elements present in the stream to speicified array.
 * toArray return object type and its our job to typecast it into object e.g Objct[] arrObj = filteredList.toArray();
 */

import java.util.*;
import java.util.stream.*;

public class ToArrayClass {

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(5);
        arrList.add(10);
        arrList.add(15);
        arrList.add(25);
        arrList.add(30);

        Stream<Integer> streamObject = arrList.stream();
        Stream<Integer> filteredList = streamObject.filter(i -> i > 5);
        Object[] filStrResult = filteredList.toArray();
        for (Object o : filStrResult) {
            System.out.println("The elements of array is: " + o);
        }

        System.out.println("Now print elements in single line");
        Object[] objectList = arrList.stream().filter(i -> i > 5).toArray();
        for (Object o : objectList) {
            System.out.println("Elements in array is: " + o);
        }

        // even without filter we can copy the stream elements.
        System.out.println("Now to print elements without filter");
        Object[] arrElementList = arrList.stream().toArray();
        for (Object obj : arrElementList) {
            System.out.println(obj);
        }

    }
}

