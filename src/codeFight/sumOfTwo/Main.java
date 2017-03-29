package codeFight.sumOfTwo;

/**
 * Created by Ps1X on 28.03.2017.
 * You have two integer arrays, a and b, and an integer target value v.
 * Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v.
 * Return true if such a pair exists, otherwise return false.

 Example

 For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
 sumOfTwo(a, b, v) = true.
 */
public class Main {
    public static void main(String[] args) {
    int [] a = {1, 2, 3};
    int [] b = {10, 20, 30, 40};
    int v = 42;
        System.out.println(sumOfTwo(a, b, v));
    }
    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (v == (a[i] + b[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
