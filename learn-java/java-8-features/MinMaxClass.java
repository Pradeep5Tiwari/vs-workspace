/* Question: How to process the elements using MIN MAX?
 * MIN(Comparator) - It will return the minimum value based on the defined comparator.
 * MAX(Comparator) - It will return the maximum value based on the defined comparator.
 *    
 */
import java.util.*;
import java.util.stream.*;

public class MinMaxClass {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        numList.add(20);
        numList.add(10);
        numList.add(50);
        numList.add(80);

        Stream<Integer> numberList = numList.stream();
        Stream<Integer> filterList = numberList.filter(i -> i > 10);

        /* Integer minNumber = filterList.min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(minNumber); */

        /* Integer maxNumber = filterList.max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(maxNumber); */

        System.out.println("Now to print in single line");

        Integer minNum = numList.stream().filter(i -> i > 10).min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(minNum);

        Integer maxNum = numList.stream().filter(i -> i> 10).max((i1,i2) -> i2.compareTo(i1)).get(); 
        System.out.println(maxNum);
        
        // Even without filtering we can apply max and min in raw stream. 
        /* Integer min = numList.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max = numList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max); */

        // If we reverse the inout element in reverse order like i2.compareTo(i1) then max num in input stream would be 
        // very minimum number. Why because bydefauly max reuturn: 80 but when we reverse it by arranging input then the 
        // oposite of max would be min.   
    }
}
