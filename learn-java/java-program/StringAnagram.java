// Write a program to check whether two string are anagram or not without using sort method.

import java.util.*;

public class StringAnagram {

    public static void main(String[] args) {

        System.out.println("Enter the first string: ");
        Scanner sc1 = new Scanner(System.in);
        String input1 = sc1.nextLine();
        System.out.println("Enter the second string: ");
        Scanner sc2 = new Scanner(System.in);
        String input2 = sc2.nextLine();
        System.out.println(" Anagram of String " + input1 + " and " + input2 + " is " + isAnagram(input1, input2));
        sc1.close();
        sc2.close();
    }

    public static boolean isAnagram(String input1, String input2) {

        if (input1.length() != input2.length()) {
            return false;
        } else {
            for (int i = 0; i < input1.length(); i++) {
                for (int j = 0; j < input2.length(); j++) {
                    if (input1.charAt(i) == input2.charAt(j)) {
                        input2 = input2.substring(0, j) + input2.substring(j + 1);
                        break;
                    }
                }
            }
            if (input2.length() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
