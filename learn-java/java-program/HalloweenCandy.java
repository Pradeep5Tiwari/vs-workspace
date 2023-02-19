/* 
Problem: Problem statement is attached within the workspace java-program folder.

Halloween Candy.png
Halloween Candy2.png

Sample Input: { 4,4,9,11,17,8}
Sample Ouput: {6}
 */

public class HalloweenCandy {

    public static void main(String[] args) {
        int[] nums = { 4, 9, 11, 17};
        int hours = 8;
        System.out.println(getMinDandies(nums, hours));
    }

    private static int getMinDandies(int[] nums, int hours) {
        int r = 0;
        for (int n : nums)
            r = Math.max(r, n);
        int l = 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (canFinish(nums, hours, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    static boolean canFinish(int[] nums, int hours, int m) {
        int res = 0;
        for (int n : nums) {
            res += n / m;
            if (n % m > 0)
                res++;
        }
        return res <= hours;
    }

}
