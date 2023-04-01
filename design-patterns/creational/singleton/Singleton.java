package creational.singleton;

import java.io.Serializable;
import java.lang.Cloneable;
public class Singleton implements Serializable, Cloneable {
    
    private static Singleton firstInstance; // Just one private static class type instance.

    private Singleton() { // private constructor so that we cannot create the object outside class via constructor. 

    }

    public static Singleton getInstance() { // one public class type static method to cross check instance if it's null and create it if null. 
        if(firstInstance == null )
        {
            firstInstance = new Singleton(); // creation of first instance.
        }
        return firstInstance; // since its class type we need to return it.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
}


/* 
Question: Why singleton class is public?
Answer: So that we can access the class and create its object in another class. If we declare this class as private then
there is no scope of it outside the class itself.

Question: Why "firstInstance" object is private? 
Answer: "firstInstance" object of "Singleton" class is private so that you cannot access it directly.

Question: If the Singleton class object "firstInstance" is private then how do we access it?
Answer: In Singleton class we create the getInstance() to access the private object firstInstance.  

Question: Why "firstInstance" object of "Singleton" class is static? 
Answer: "firstInstance" object of "Singleton" class is static so that "firstInstance" object will be loaded and get memory 
as soon as class "Singleton" will get loaded into memory at very first time. Though if you try to create object multiple time 
then you won't be able to create the object. Only one time this "firstInstance" will be laoded into memory since its static.    

Question: Why we don't create setter method in singleton class?
Answer: So, that we cannot set the value and we can only get the value using getInstance() method.

Question: Why the constructor is private?
Answer: Constructor is private so that we cannot instantiate the class "Singleton" object using the "new" keyword.

Question: What is eager loading and lazy loading in singleton class?
Answer: 
public class Sinleton {

    private static Singleton firstInstance = new Singelton(); // Eager Loading
}

public class Singleton {
    private static Singleton firstInstance = null;

    public static Singleton getInstance() {
        if(firstInstance == null) {
            firstInstance = new Singleton();                // Lazy Loading
        }
    }
} 

*/