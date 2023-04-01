/* Question: How to sort the elements using customized sorting descending order?
 * Answer: We can use comparator - compareTo() method where the two argument can be taken in reverse order like below.
 * Example: sorted(i1, i1) -> i2.compareTo(i1);
 */
import java.util.*;
import java.util.stream.*;

public class SortedDescClass {

    public static void main(String[] args) {
        List<Integer> numberTosort = new ArrayList<>();
        numberTosort.add(59);
        numberTosort.add(19);
        numberTosort.add(39);
        numberTosort.add(190);
        numberTosort.add(129);
        
        Stream<Integer> strObject = numberTosort.stream();
        Stream<Integer> filterNumList = strObject.filter(i -> i > 19);
        Stream<Integer> sortTheNumber = filterNumList.sorted((i1, i2) -> i2.compareTo(i1));
        sortTheNumber.forEach(x -> System.out.println(x));

        System.out.println("Now printing in single line");
        Stream<Integer> descSortedList = numberTosort.stream().filter(i -> i > 29).sorted((i1,i2) -> i2.compareTo(i1));
        descSortedList.forEach(x -> System.out.println(x));

        // Customized sorting even can work on row stream without filter() method.
        System.out.println("Even without filter on row strem using customized sorting desc order");
        Stream<Integer> descSortedElements = numberTosort.stream().sorted((i1,i2) -> i2.compareTo(i1));
        descSortedElements.forEach(x -> System.out.println(x));

    }
}
