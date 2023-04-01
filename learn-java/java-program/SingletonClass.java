// Design a singleton class.

public class SingletonClass {

    private static SingletonClass firstInstance = null; // Just one private static class type instance.
    private SingletonClass() { // private constructor so that we cannot create the object outside class via constructor. 

    }
    public static SingletonClass getInstance() {  // one public class type static method to cross check instance if it's null and create it if null. 
        if(firstInstance == null) {
            firstInstance = new SingletonClass(); // creation of first instance.
        }
        return firstInstance; // since its class type we need to return it.
    }
}
