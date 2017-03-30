package codeFight.tripletSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 28.03.2017.
 * You have an array a composed of exactly n elements. Given a number x,
 * determine whether or not a contains three elements for which the sum is exactly x.
 * <p>
 * Example
 * <p>
 * For x = 15 and a = [14, 1, 2, 3, 8, 15, 3], the output should be
 * tripletSum(x, a) = false;
 * <p>
 * For x = 8 and a = [1, 1, 2, 5, 3], the output should be
 * tripletSum(x, a) = true.
 * <p>
 * The given array contains the elements 1,2, and 5, which add up to 8.
 */
public class Main {
    public static void main(String[] args) {
        int x = 8;
        int[] a = {1, 1, 2, 5, 3};
        System.out.println(tripletSum(x, a));
    }

    public static boolean tripletSum(int x, int[] a) {
        List<Integer> testYouLuck = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            testYouLuck.add(a[i]);
        }

        for (int i = 0; i < testYouLuck.size() - 1; i++) {
            int x1 = 0;
            for (int j = i + 1; j < testYouLuck.size(); j++) {
                x1 = x - testYouLuck.get(i) - testYouLuck.get(j);
                if (testYouLuck.contains(x1)) {
                    if (x1 != testYouLuck.get(i) && x1 != testYouLuck.get(j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
