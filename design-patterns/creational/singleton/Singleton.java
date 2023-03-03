public class Singleton {
    private static Singleton firstInstance = null; // Just one private static class type instance.

    private Singleton() { // private constructor so that we cannot create the object outside class via constructor. 

    }

    public static Singleton getInstance() { // one public class type static method to cross check instance if it's null and create it if null. 
        if(firstInstance == null )
        {
            firstInstance = new Singleton(); // creation of first instance.
        }
        return firstInstance; // since its class type we need to return it.
    }
}