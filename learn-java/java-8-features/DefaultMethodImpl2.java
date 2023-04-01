/* In below class DefaultMethodImpl2 we are overriding defaultMethod() of DefaultMethod interface.
 * And since we are overriding we don't need to add default as prefix again in this DefaultMethodImpl2 implementing class rather
 * Need to add public as modifier with return type and then custom print message. 
 * Now call the defaultMethod() using DefaultMethodImpl2 class reference object and you would see that we would get the 
 * custom overridden printed message instead the initial message what we passed in DefaultMethod. 
 */
public class DefaultMethodImpl2 implements DefaultMethod {

    public void defaultMethod() {
        System.out.println("This is the overridden default method in DefaultMethodImpl2 class.");
    }

    public static void main(String[] args) {
        DefaultMethodImpl2 defaultMethodImpl2 = new DefaultMethodImpl2();
        defaultMethodImpl2.defaultMethod();
    }

}
