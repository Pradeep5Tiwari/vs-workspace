/* Question: What are streams?
 * Answer: If we want to process the bulk objects of collection then we should go for streams.
 * Streams is a way to operate on collection in java 8.
 * Streams is a special iterator class that allow processing collections of objects in a functional manner.
 * Example: Fetch all the objects from collection of list whose value is greator than 15.  
 * As you can see below in example how we are reducing 12 line of code into 3 line.
 * 
 * Question: What are the difference between streams of java 1.8 and exisating java.io.Stream?
 * Answer: Java.io.streams: is a sequence of characters or binary data which is used to be written to a file or to read data from file.
 * Where Java 1.8 streams are no where related to 'files', its related to 'collection objects'.  
 * Hence we need to perform some operation of collection so there we should go for streams.
 * 
 * Question: What is the differece between collection and streams?
 * Answer: Collection is a group of individual objects OR it represent group of collection into single entity where streams
 * if we want to perform some operations on bulk objects in collection then we should go for streams.
 * 
 */
// Program to print the list of age who are greator than 15.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;    // - This need to be imported when using traditomnal method to print the age.

public class Streams {

    public static void main(String[] args) {

        List<Integer> ageList = new ArrayList<>();
        ageList.add(5);
        ageList.add(10);
        ageList.add(15);
        ageList.add(20);
        ageList.add(25);
        ageList.add(30);

        // Without stream
        /* List<Integer> myList = findAgeElements(ageList);
        for (Integer i : myList) {
            System.out.println(i);
        } */

        List<Integer> listAge = new ArrayList<>();
        listAge = ageList.stream().filter(s -> s >= 15).collect(Collectors.toList());
        listAge.stream().forEach(s -> System.out.println(s));
    }

    // Without stream
    /* public static List<Integer> findAgeElements(List<Integer> ageList) {
        List<Integer> arList = new ArrayList<Integer>();
        for (Integer i : ageList)
            if (i >= 15) {
                arList.add(i);
            }
        return arList;
    } */
}