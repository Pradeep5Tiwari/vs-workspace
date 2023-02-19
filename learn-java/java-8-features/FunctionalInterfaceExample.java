/* Functional Interface: are those interfaces which have only one abstract method.(SAM)
 * It can have any number of default and static method, no restriction on that.
 * There are many functional interface which are already present in java e.g Comparable, Runnable and BiConsumer.
 * 
 * Functional Interface: is used to provide a refernce to lambda expression.
 *  -> This is the relation. 
 * Question: How lambda expressson and functional interface are related to? 
 * Answer: Comparator<String> c = (s1,s2)-> s1.compareTo(s2); where 
 * Comparator<String> c ---> is a functional interface and 
 * (s1,s2)->s1.compareTo(s2) ---> is a lambda expression.
 * Thus, to call lambda expression we need functional interface.
 * 
 * Question: Can you create your own functional interface?
 * Answer: yes, we can create our own functional interface and to do that 
 * i) Create a interface
 * ii) Annotate it with @FunctionalInterface
 * iii) Define exactly one single abstract method(SAM)
 * iv) There is no restriction on any number of default and static method.
 * 
 * Java can implicitly identifies functional interface but still you can annotate it with @FunctionalInterface annotation
 * It' just give you the security measure that that in case by mistake if you add 2 abstract method then compiler
 * will throw the compiler time error.
 * 
 * Annotating interface with @FunctionalInterface is not mandatory but it's just for security measure to let developer know. 
 */

@FunctionalInterface
public interface FunctionalInterfaceExample {

    void printAbstractMethod(); // no need to write "public" and "abstract" as per interface property it's by default.
    // void printAbstractMethod2();  // If we define another abstract method then it would throw compile time error 

    default void printDefaultMethod() {
        System.out.println("This is the default method implementaton");
    }

    static void printStaticMethod() {
        System.out.println("This is static method implementation");
    }
}
