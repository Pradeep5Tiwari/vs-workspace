// Write a program to print a given string in below fashion. [asked by altimetric]
// String input = "abcde";
// String output = "ABbCccDdddEeeee"; 
public class StringRFormat {

    public static void main(String[] args) {

        String input = "abcde";
        char[] ch = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char temp = ch[i];
            int j;
            for (j = 0; j <= i; j++) {
                if (j == 0) {
                    builder.append(String.valueOf(temp).toUpperCase());
                } else {
                    builder.append(String.valueOf(temp));
                }
            }
        }
        System.out.println("The ouput of given string is: " + builder);
    }
}
