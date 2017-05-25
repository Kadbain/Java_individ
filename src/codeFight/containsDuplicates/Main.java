package codeFight.containsDuplicates;

import java.util.HashSet;

/**
 * Created by Ps1X on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicates(numbers));
    }

    public static boolean containsDuplicates(int[] a) {
        if (a == null || a.length == 0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : a) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }
}
