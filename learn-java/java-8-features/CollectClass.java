
/* Write a program to create the configuration using filter() and then proess the configuration using collect(0 method) */

import java.util.*;
import java.util.stream.*;

public class CollectClass {

    public static void main(String[] args) {

        // 1. create the collection object list
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(15);
        numList.add(25);
        numList.add(35);
        numList.add(45);
        numList.add(55);
        numList.add(65);
        
        // Create the stream object by calling stream() method on collect object(numList).
        Stream<Integer> streamOrigList = numList.stream();
        
        // Now filter/configure the stream object - streamOrigList using filter() method.
        Stream<Integer> filteredNumList = streamOrigList.filter(n -> n >= 15);

        // Now process the filtered list to list using collect()
        List<Integer> processFilteredList = filteredNumList.collect(Collectors.toList());

        // Now iterate on each object/number of processFilteredList using forEach() and print the filtered list. 
        processFilteredList.forEach(n -> System.out.println(n));

        System.out.println("printing now in single line");

        // Now we would optimize above code into single line.
        List<Integer> newFilteredOriginList = numList.stream().filter(n -> n >= 20).collect(Collectors.toList());
        newFilteredOriginList.forEach(x -> System.out.println(x));

        // You would see above that how good we have optmized 4 line of code into just 2 line. 
    }
}
