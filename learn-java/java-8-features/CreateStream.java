import java.util.ArrayList;

/* Question: How can you create a streams?
 * Answer: First of all we must know that streams work on collection objects and on collection object if you call the 
 * 'stream()'' method then you will get the stream objects. So this is the very simple way to create the stream.
 * 
 * Example: Stream s = collectionObject.stream();
 * Once we get the stream object we can process the object of collection.
 * Prcoessing of stream consists of two steps/stages.
 * 1) configuratoon of stream and 
 * 2) processing that configuration.
 * And configuration can be done by using below                                       
 * 1) Map 
 * 2) Filter                                
 *                                                  Streams
 *                                                     |
 *                                      -----------------------------------            
 *                                      |                                  |
 *                              Configuration of stream             Processing of that configuration 
 *                                  |
 *                          ------------------
 *                          |                |
 *                         Map             Filter
 * **********************************************************************************************************************
 *                                                  Streams
 *                                                     |
 *         --------------------------------------------            
 *         |                                          |
 * Configuration of stream             Processing of that configuration 
 *         |                                          |  
 * ------------------        -------------------------------------------------------------------------------                      
 * |                |         |          |           |          |            |               |              |
 *Map             Filter   Collect    Count       Sorted    Min Max      For Each         toArray          of()
 *************************************************************************************************************************      
 * 
 *  */

import java.util.*;
import java.util.stream.*;

public class CreateStream {

    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(5);
        arrList.add(10);
        arrList.add(15);
        arrList.add(25);
        arrList.add(30);

        // Stream streamObject = arrList.stream(); // To create a stream we are calling
        // stream() method on collection object.
        // streamObject.forEach(s -> System.out.println(s));

        Stream<Integer> streamObject = arrList.stream().filter(i -> i % 2 == 0);
        streamObject.forEach(x -> System.out.println(x));

        // We added 'Integer' in Stream like "Stream<Integer>" becuase of type safety.
        // Otherwise we were getting below warning. So we added / parameterized
        // "Integer" as type.

        /*
         * Type safety: The method forEach(Consumer) belongs to the raw type Stream.
         * References to generic type Stream<T> should be parameterized
         */

    }
}
