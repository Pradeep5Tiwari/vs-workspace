// Write a program to print the armstrong number.

public class ArmStrongNumber {

    public static void main(String[] args) {

        int originalNumber = 371, result = 0, remainder;
        int number = originalNumber;
        while (number != 0) {
            remainder = number % 10;
            result += Math.pow(remainder, 3);
            number = number / 10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an armstring number");
        } else {
            System.out.println(originalNumber + "is not an armstrong number");
        }
    }
}
