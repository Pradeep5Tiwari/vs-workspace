
// Write a program to check the anagrams of two string.
import java.util.Arrays;

public class AnagramOfString {

    public static void isStringAnagrams(String str1, String str2) {

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        boolean results = Arrays.equals(s1, s2);
        if (results) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }

    public static void main(String[] args) {
        String str1 = "army";
        String str2 = "mary";
        isStringAnagrams(str1, str2);
    }
}
