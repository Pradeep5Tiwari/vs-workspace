// Write a program to count the occurrence of character in given string.

public class StringCharOccurrence {

    public static void main(String[] args) {

        String s = "Hello my name is pradeep";
        char[] alphabet = s.toCharArray();
        char ch = 'p';
        char ch2 = 'e';
        int counter = 0;
        int counter2 = 0;
        // int strLength = s.length();
        for (int i = 0; i < alphabet.length; i++) {

            if (alphabet[i] == ch) {
                counter = counter + 1;

            }
            if (alphabet[i] == ch2) {
                counter2 = counter2 + 1;
            }
        }
        System.out.println("The occurrence of given character is" + counter + "and " + counter2 + "respectively");
    }

}
