/* We have two interface DiamondProblemInterface1 and DiamondProblemInterface2 and both have same method name.
 * Now we have class DiamondProblemClass.java which implements both interface and 
 * Since the moment we write "implements interfaceName1 and interfaceName2" then our class DiamondProblemClass start 
 * throwing error because both interface has same method name.
 * Now in such a situation the solution to diamond problem is to use "InterfaceName.super.MethodName();"
  */

public class DiamondProblemClass implements DiamondProblemInterface1, DiamondProblemInterface2 {

    // If I want to use DiamondProblemInterface1 method then
    @Override
    public void method1() {
        DiamondProblemInterface1.super.method1();
    }

    public static void main(String[] args) {
        DiamondProblemClass diamondProblemClass = new DiamondProblemClass();
        diamondProblemClass.method1();
    }
}
