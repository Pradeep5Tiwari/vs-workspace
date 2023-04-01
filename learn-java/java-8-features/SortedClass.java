/* Question: What is the use of sorted() method and how to process the elements using sorted()
 * Answer: If we want to sort the elements inside the stream the use the sorted() method.
 * We can sort the element using default natural sorting order.
 * If we want to sort the element using custommized sorting order then use 'comparator'.
 */

import java.util.*;
import java.util.stream.*;
public class SortedClass {
    public static void main(String[] args) {

        List<Integer> myNumList = new ArrayList<>();
        myNumList.add(10);
        myNumList.add(250);
        myNumList.add(350);
        myNumList.add(410);
        myNumList.add(50);
        
        Stream<Integer> numElement = myNumList.stream();
        Stream<Integer> filteredElement = numElement.filter(i -> i > 10);
        Stream<Integer> sortedElement = filteredElement.sorted();
        sortedElement.forEach(x -> System.out.println(x));
        //System.out.println("The elements are sorted: " + sortedElement);

        System.out.println("Now print in single line.");

        Stream<Integer> sortedNumElement = myNumList.stream().filter(i -> i> 50).sorted();
        sortedNumElement.forEach(x -> System.out.println(x));

        // even we can apply sorted() method on row stream without using filter() method like below.
        System.out.println("Even Without filtering we can sort the elements like below");
        Stream<Integer> sortNumElement = myNumList.stream().sorted();
        sortNumElement.forEach(s-> System.out.println(s));

        List<Integer> numList = Arrays.asList(2,1,3,6,89,23,54,12,33,56);
        Stream<Integer> listOfNum = numList.stream().filter(i -> i > 1).sorted((i1,i2) -> i1.compareTo(i2));
         listOfNum.forEach(i -> System.out.println(i));
    }
}