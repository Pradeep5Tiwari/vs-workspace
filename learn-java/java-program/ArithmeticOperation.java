// Write a progrm to perform aruthmetic operation in java.

import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {

        int sum, sub, mul, div;
        System.out.println("Enter the first number: ");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        System.out.println("Enter the second number: ");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        sc1.close();
        sc2.close();
        sum = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;
        System.out.println("\n The sum of two number is: " + sum);
        System.out.println("\n The subtraction of two number is: " + sub);
        System.out.println("\n The multiplication of two number is: " + mul);
        System.out.println("\n The division of two number is: " + div + "\n");
    }

}
