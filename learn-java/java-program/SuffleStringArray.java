// Write a program to suffle the string array in below fashion. [asked by altimetric]
// String arr[] = {AB CD EF GH IJ}
// String output[] = {CD AB GH EF IJ}
// String arr2[] = {AB CD EF GH IJ KL MN OP}
// String output2[] = {CD AB GH EF KL IJ OP MN} 

public class SuffleStringArray {

    public static void main(String[] args) {

        String strInput = "AB CD EF GH IJ";
        StringBuilder builder = new StringBuilder(" ");
        String[] letters = strInput.split(" ");
        int strLength = 0;
        if (letters.length + 1 % 2 == 0) {
            strLength = letters.length;
        } else {
            strLength = letters.length - 1;
        }
        for (int i = 0; i < strLength; i++) {
            builder.append(letters[i + 1] + " ");
            builder.append(letters[i] + " ");
            i += 1;
        }
        strLength = strLength + 1;
        if (strLength % 2 == 0) {
            // don't do anything.
        } else {
            builder.append(letters[strLength - 1]);
        }
        System.out.println(builder);
    }
}
