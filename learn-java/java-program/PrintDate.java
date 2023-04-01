/* Write a program to print the current date and time */

import java.util.Date;

public class PrintDate {

    public static void main(String[] args) {
        PrintDate printDate = new PrintDate();
        System.out.println("\n The current date is: " + printDate.getCurrentDate() + "\n");
    }

    public Date getCurrentDate() {
        return new Date();
    }
}
