// This is the proxy class which is an substitute for SubjectImplementation.
// After perforing authention and other security checks only then it's going to call original method before / after.

public class ProxyClass extends SubjectImplementaton {
    @Override
    public void myMethod() {
        System.out.println("This is proxy class and this method is for checking authentication and security checks");
        // Here we can write the logic to check if user is authentic or not? 
        // If yes then call the real object else don't call below method.

        System.out.println("\nCalling real method of SubjectImplementation class after the call is authenticated");
        super.myMethod();
    }

}
