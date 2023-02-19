/* Question: What are the difference berween terminal and non-terminal operation
 * Answer: Terminal operation marks the end of the stream where non terminal operation are the intermediate one, 
 * they are lazily executed operation and depend on the terminal operation execution. because intermediate operaton get
 * invoked after we invoked terminal operation.  
 * 
 * Note: intermediate operation will never run if no terminal operation involved.
 */
import java.util.*;

public class TerminalVsNonTerminal {

    public static void main(String[] args) {

        TerVsNonTerEmployee e1 = new TerVsNonTerEmployee(1, "Pradeep");
        TerVsNonTerEmployee e2 = new TerVsNonTerEmployee(2, "Mohan");
        TerVsNonTerEmployee e3 = new TerVsNonTerEmployee(3, "Shyam");
        TerVsNonTerEmployee e4 = new TerVsNonTerEmployee(4, "Kaushal");

        List<TerVsNonTerEmployee> empList = Arrays.asList(e1, e2, e3, e4);
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        // uses of peek specially
        intList.stream().filter(i -> i % 2 == 0).peek(System.out::println).map(i -> i + i).filter(i -> i > 5).count();//.forEach(i -> System.out.println(i));
        
        /* empList.stream().filter(i -> i.getId() % 2 == 0).map(i -> {
            i.printName();
            return i.getName();
        }).forEach(e -> System.out.println("At last: " + e)); */

        // uses of reduce()
        System.out.println("The reduce() method combining stream elements(1,2,3,4,5) and producing sum = 10 to one value which is 10");
        System.out.println(intList.stream().reduce((a,b) -> a+b).get());
    }
}
