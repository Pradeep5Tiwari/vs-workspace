
// Write a program to sort the numbers in assending order.
import java.util.Arrays;

public class SortingNumbers {

    public static void main(String[] args) {

        int arr[] = { 90, 60, 40, 30, 70, 20, 10 };
        Arrays.sort((arr));
        for(int i =0; i<arr.length; i++) 
        System.out.println(arr[i]);
        /*
         * for (int i = 0; i <= arr.length - 1; i++) {
         * for (int j = i + 1; j <= arr.length - 1; j++) {
         * if (arr[j] < arr[i]) {
         * int temp = arr[i];
         * arr[i] = arr[j];
         * arr[j] = temp;
         * }
         * }
         * System.out.println(arr[i]);
         * }
         */

    }
}
