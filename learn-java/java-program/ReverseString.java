// Write a program to print the reverse of string. 

public class ReverseString {

    public static void main(String[] args) {

        String str = "Tehri Garhwal";
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());

        /*
         * String str = "Pradeep Tiwari";
         * StringBuilder builder = new StringBuilder();
         * builder.append(str);
         * System.out.println("The given string is: " + builder);
         * builder.reverse();
         * System.out.println("The reverse string is: " + builder);
         */

        /*
         * String str = "Generation";
         * char[] ch = str.toCharArray();
         * for(int i = ch.length-1; i >= 0; i--) {
         * System.out.print(ch[i]);
         * }
         */

        /*
         * String myStr = "Coding";
         * String reverse = "";
         * for(int i = myStr.length()-1; i>=0; i--) {
         * reverse = reverse + str.charAt(i);
         * }
         * System.out.println(reverse);
         */
    }
}
