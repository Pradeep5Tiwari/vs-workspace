
// Write a program to check whether the year is leap year or not?
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter the year to check whether it's leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if (year % 4 == 0)
            if (year % 100 == 0)
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
    }
}
