
// Write a program to convert array / character array into string. There are four way to convert array into string.
import java.util.*;
import java.util.stream.Collectors;

public class ArrayToString {

    public static void main(String[] args) {

        /*
         * char[] ch = { 'a', 'e', 'i', 'o', 'u' };
         * String str = new String(ch);
         * System.out.println("The converted char array to string is: " + str);
         */

        /*
         * char[] ch2 = { 'p', 'r', 'a', 'd', 'e', 'e', 'p' };
         * ch2.toString();
         * System.out.println(ch2);
         */

        /*
         * StringBuilder builder = new StringBuilder("Hello");
         * builder.toString();
         * System.out.print(builder);
         */

        String[] stringArray = { "My", "name", "is", "Pradeep", "!" };

        // 1. Using the Arrays.toString() method
        String string1 = convertArrayToStringUsingToString(stringArray);
        System.out.println("An array converted to string using Arrays.toString(): " + string1);

        // 2. Using the StringBuilder.append() method
        String string2 = convertArrayToStringUsingAppend(stringArray);
        System.out.println("An array converted to string using StringBuilder.append(): " + string2);

        // 3. Using the String.join() method
        String string3 = convertArrayToStringUsingJoin(stringArray);
        System.out.println("An array converted to string using String.join(): " + string3);

        // 4. Using the Collectors.joining() method
        String string4 = convertArrayToStringUsingJoining(stringArray);
        System.out.println("An array converted to string using Collectors.joining(): " + string4);

    }

    // 1. Using the Arrays.toString() method
    public static String convertArrayToStringUsingToString(String[] stringArray) {
        return Arrays.toString(stringArray);
    }

    // 2. Using the StringBuilder.append() method
    public static String convertArrayToStringUsingAppend(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
    }

    // 3. Using the String.join() method
    public static String convertArrayToStringUsingJoin(String[] stringArray) {
        String str = String.join(" ", stringArray);
        return str;
    }

    // 4. Using the Collectors.joining() method
    public static String convertArrayToStringUsingJoining(String[] stringArray) {
        String str = Arrays.stream(stringArray).collect(Collectors.joining());
        return str;
    }
}

/*
 * . Arrays.toString() method
 * 
 * Arrays.toString() method returns the string of the input array. The returned
 * string is a string representation of the input array.
 * 
 * The returned string contains the elements of the input array separated by the
 * comma and followed by space. Also, the element is surrounded by ‘[]’.
 * 
 * 2. StringBuilder.append() method
 * 
 * In this way, we are appending each element of the input array to an instance
 * of the StringBuilder class using the append() method.
 * 
 * By using this method, we can get the string from the elements of the input
 * array connected without spaces.
 * 
 * 3. String.Join() method
 * 
 * Java 8 and above, you can use the join() method of the String class converts
 * an array to string.
 * 
 * 4. Collectors.joining() method
 * 
 * Java 8 provides the Stream API. You can use the joining() method of the
 * Collectors class to convert an array to string.
 * 
 * The following program shows you how to convert an array to string.
 */