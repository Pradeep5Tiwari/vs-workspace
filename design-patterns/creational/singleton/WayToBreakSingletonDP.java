package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WayToBreakSingletonDP {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException  {

        // ------------------------------------### Reflection ###-----------------------------------------------------------
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Breaking using reflection");
        Singleton originalSingletonInstance = Singleton.getInstance();
        // At this line we have catched-up/holded up of singleton class. 
        Class<?> singletonClass = Class.forName("creational.singleton.Singleton"); 

        // Now we want to get hold of my constructor. 
        Constructor<Singleton> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();

        // Now to make this private constructor "private Singleton(){ }" accesible to this class so that you will be 
        // able to cretae new instance with this constructor. and the way to do that is given below.
        constructor.setAccessible(true); 
        
        // So with above line we make sure that the your private constructor is no more private. And that is because
        // of reflection we have made it accessible to even this class is the way to break the single design pattern.
        // constructor.newInstance();"
        // So, as soon as we create new instance you are going to get a singleton instance.
        Singleton brokenSingletonUsingReflectionInstance = constructor.newInstance(); 
        
        // Now to make sure that reflection has broken my singleton design pattern they way to do is that we print the 
        // hashcode.
        System.out.println("\nBelow are the two different hashcode for singleton class using reflection \n ");
        System.out.println("The Hashcode for originalSingletonInstance is: " + originalSingletonInstance.hashCode());
        System.out.println("The Hashcode for brokenSingletonUsingReflectionInstance is: " + brokenSingletonUsingReflectionInstance.hashCode());

        // ------------------------------------### Serialization ###----------------------------------------------------------------
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Breaking using serialization");

        // Serialization Process
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(".\\Serialization.ser"));
        objectOutputStream.writeObject(originalSingletonInstance);
        objectOutputStream.close();

        try (// Deserialization Process
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(".\\Serialization.ser"))) {
            Singleton brokenSingletonUsingSerializationInstance = (Singleton) objectInputStream.readObject();

            System.out.println("\nBelow are the two different hashcode for singleton class using serialization \n ");
            System.out.println("The Hashcode for originalSingletonInstance is: " + originalSingletonInstance.hashCode());
            System.out.println("The Hashcode for brokenSingletonUsingReflectionInstance is: " + brokenSingletonUsingSerializationInstance.hashCode());
        }

         // ------------------------------------### Cloning ###----------------------------------------------------------------
         System.out.println("---------------------------------------------------------------------------------------------");
         System.out.println("Breaking using cloning");
         
         Singleton brokenSingletonUsingCloningInstance = (Singleton) originalSingletonInstance.clone();
         System.out.println("\nBelow are the two different hashcode for singleton class using cloning \n ");
         System.out.println("The Hashcode for originalSingletonInstance is: " + originalSingletonInstance.hashCode());
         System.out.println("The Hashcode for brokenSingletonUsingReflectionInstance is: " + brokenSingletonUsingCloningInstance.hashCode());
    }
}

/* There must be some way to break the singleton design pattern!!! 
1. Reflection
2. Serialization
3. Cloning
4. ThreadExecutorService
*/

/* 
 * Reflection: This is the way in which you can create an instance of singleton design pattern but the hashcode will
 * be the different that means you have broken the sigleton design pattern successfully and two different objects are 
 * created at two different memory location with the help of these hashcode and that means your singleton design pattern
 * is no more singleton design pattern and it has become a prototype.
 * 
*/

