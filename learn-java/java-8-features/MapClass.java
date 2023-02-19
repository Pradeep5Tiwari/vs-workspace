import java.util.ArrayList;
// import java.util.stream.Stream;
/*  * Question: How to Map the stream objects.? What if we don't to filter out?
 * Answer: We rather want to create the new objects against each existing stream object based on some function.   
 * Example: In given stream create new object by squaring its value. 
 *  
 * */
import java.util.*;
public class MapClass {
    
    public static void main(String[] args) {
        List<Integer> myNumberList = new ArrayList<>();
        myNumberList.add(10);
        myNumberList.add(20);
        myNumberList.add(30);
        myNumberList.add(40);
        myNumberList.add(50);
        myNumberList.add(60);

        /* Stream<Integer> streamObject = myNumberList.stream().map(i->i*i);
        streamObject.forEach(x->System.out.println(x)); */

        // Optimize above code into one line.
        myNumberList.stream().map(i -> i*i).forEach(x -> System.out.println(x));
    }
}
