/* Question: Why Static methods were introduced in java 8?
 * Answer: The only reason for introducing static methods is that you can call those methods with just interface name. 
 * No need to create the class and then its object.
 * Since interface can never contain: Constructor,static block, nothing costly in terms of memory and performance.
 * Hence we don't need to create object and hence of you have everything static, then for interface rather than class.
 * You have this flexibility only after java 8, before that you don't need to create a class.
 * 
 * Question: Are static methods available to implementing classes by default?
 * Answer: Static methods are not available to implementing classes.
 * They are not default they are static.
 * Hence you can call these methods using interface name explicitly from the implementing classes as implementing classes 
 * won't have access to these methods directly.(This is disadvantages of static methods of interface that its not available to implementing classes.)   
 */
public interface StaticMethod {
    
    static void staticMethod() {
        System.out.println("This is the static method of StaticMethod interface");
    }

}
