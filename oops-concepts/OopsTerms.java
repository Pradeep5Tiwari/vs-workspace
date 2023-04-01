//package oops-concepts;  // package "oops-concepts" it helps us to group the classes and categorize the classes and interfaces. if we have two class with same name but written for different purpose then it segregate them.       
//import java.io.*;      //  import keyword to import java input/output class. "import" keyword is used when we want to import other classes outside it's package. 
class MethodsClass {    //   default class "MethodsClass" when we don't specify any access/non-access modifier in class name then it automatically become default class.   

    Integer number1 = 10; //    Integer is a object type wrapper class for int primitive type which contains several methods to effectively deal with an int value like converting it to string representation, and vice versa. An object of Integer class can hold th single value.  
    String s = "pradeep"; //    
    Float f = 10.5f;      //  Instance Varibles   
    Double d = 10.50;     //    
    Character c = 'p';    //

    static int n = 50;    //  Static variable  of integer type whose value will remain same no matter how many objects are dealing with it. a constant value. 

    void method1() {     //   default method "method1" which does not return anything. when we don't specify any access/non-access modifier in method then automatically become default method.
        System.out.println("This is default method1");
    }
    public void method2() {     // public method "method2" which does not return anything.
        System.out.println("This is default method2");
    }
    static void myStaticMethod() {     // static or class method "myStaticMethod" which does not return anything. It's accessible through both its class name and class object/instnace/reference. 
        System.out.println("This is static method");
    }
    public int myReturnMethod() {     // public method "myReturnMethod" which return integer type value of it's result.
        int a = 10;     // local variable whose scope is limited upto this method only. We must initialize the local variable.
        int b = 10;    //  local variable 
        int result = a+b;
        System.out.println(result);
        return result;
    } 

    public String myStringMethod() {     // public method "myStringMethod" which return string type value of it's result.
        String s1 = "pradeep";     // Immutable string litteral object s1 with its value.
        String s2 = "tiwari";
        String stringResult = s1.concat(s2);     //string concatenation 
        System.out.println(stringResult);
        return stringResult;     // returning string type value as method type is string. 
    }

    public void reverseStringMethod() {     // public method "reverseStringMethod" which does not return anything.
        String str = "World War Third";
        char [] alphabet = str.toCharArray(); // converting string to character value into array of character type using toCharArray().
        System.out.print("The reverse of string 'World War Third' is: ");
        for(int i=alphabet.length-1; i>=0;i--) {  // 'for loop' start from string length to untill i value become 0 in dscending order.
            System.out.print(alphabet[i]); // this print all string characterwise together into one as string.
        }
    }
}
public class OopsTerms {     // main class 'OopsTerms' or main method class which is responsible to run/start the program.  
    public static void main(String[] args) {     // main method or entry point from where the execution start.
        MethodsClass methodsClassObj = new MethodsClass(); // "MethodClass" --> another class who's object we create here.//"methodsClassObj" --> class object or instance which gets created for calling different method of it's class.// "new" --> java dma(dynamic memory allocation) keyword which is responsible for allocating memory to instance/class object and which store class object into heap memory.// "MethodClass()"" --> this is class constructor which is called when we create class object.     
        methodsClassObj.method1();     // calling "method1" of MyMethod class using it's object "methodsClassObj"
        methodsClassObj.method2();
        MethodsClass.myStaticMethod(); // calling static method "myStaticMethod()" using class name "MethodsClass" because accessing class name is the recommended way that's how static method gets access.
        //methodsClassObj.myStaticMethod(); // we can call static method "myStaticMethod()" using class object "methodsClassObj" as well because we can access it but it's not recommended and gives warning.
        methodsClassObj.myReturnMethod();
        methodsClassObj.myStringMethod();
        methodsClassObj.reverseStringMethod();
    }
}
