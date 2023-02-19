/* Question: How to process elements using of() method? 
 * Answer: Stream concept is not applicable just for collections but it's also applicable for "ANY GROUP OF VALUE". e.g Stream.of(1,11,111,1111)
 * meaning till now we have used stream for Collection List elements but what if we don't have collections objects? then
 * would you able to use stream? and the answer is 'YES'. We can convert any GROUP OF VALUE (Stream.of(1,11,111,1111)) to stream.
 * 
 * Question: Why do we want to convert it into stream?
 * Answer: Because stream has many benifits. As we have seen using the stream we can 
 * 1) 'count' the elements.
 * 2) 'filter' the elements
 * 3) 'map' the elements and so on with stream on collection of objects.
 * Because there might be a chances that they want to convert group of elements int o stream. So how would you do that? 
 * So, just use this method 'Stream.of()' on any group of value. It will be converted into stream.
 * 
 * Even for arrays you can create the stream.
 * Stream.of() - this method can take any group of values and convert them to stream so that multiple stream operations like
 * filter(),Map(),collect,count,sorted(),forEach(),toArray(),of() can be applied to it.
 *    
 *   
*/
import java.util.stream.*;
public class OfArrayClass {
    
    public static void main(String[] args) {

        Stream.of(1,11,111,1111,11111,111111).forEach(x -> System.out.println(x));

        String[] name = {"Pradeep Tiwari", "MIT", "GEU"};
        Stream.of(name).filter(x -> x.length() > 4).forEach(x -> System.out.println(x));
    }
}

