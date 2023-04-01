// Write a program to check whether two string are same or not.

import java.util.Scanner;

public class EqualString {
    public static void main(String[] args) {

        System.out.print("Enter the first string: ");
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        System.out.print("Enter the second string: ");
        Scanner sc2 = new Scanner(System.in);
        String s2 = (sc2.nextLine());
        sc1.close();
        sc2.close();
        if (s1.equals(s2)) {
            System.out.println("\n String are equal content wise");
        } else {
            System.out.println("\n String are not equal content wise");
        }
        if (s1 == s2) {
            System.out.println("\n String are equal referencewise");
        } else {
            System.out.println("\n String are not equal reference wise");
        }
        System.out.println(
                "\n The hascode of two string objects are: " + "\n" + "First String: " + s1 + s1.hashCode() + "\n"
                        + "Second String: " + s2 + ":" + s2.hashCode());
    }
}