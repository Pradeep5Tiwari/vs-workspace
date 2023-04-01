/* Question: What is supplier functional interface?
 * Answer: Supplier<R> is also a predefined functional interface. It will not take any input but will only supply the required object.
 * It's always going to supply never consume / take any input.
 * Example: Always supply me a current date.
 * Interface<R> {
 * public R get();
 * }
 * Question: How do you perform chaining in Supplier interface?
 * Answer: No chaining in this interface as no input os given to this. only it gives you output(return type). 
 * Chaining is done when you have one input and you have to do multiple operation and rather than using different = 2 consumer/predicate/functions.
 * Question: What are the advantages of supplier?
 * Answer: Write once use anywhere(wora) OR code reusability. 
 */

import java.util.Date;
import java.util.function.Supplier;
public class SupplierFunctionalInterface {
    
    public static void main(String[] args) {

        SupplierFunctionalInterface supplierFunctionalInterface = new SupplierFunctionalInterface();
        System.out.println("The current date is: " + supplierFunctionalInterface.fetchCurrentDate()); // Traditional way

        // Modern way using Supplier functional interface.
        Supplier<Date> myDate = () -> new Date(); // Here Supplier<Date> 'Date' is just return type not input.  
        System.out.println(myDate.get());
    }

    public Date fetchCurrentDate() {
        return new Date();
    }
}
