package OOP.Test35;

import java.util.Map;
import java.util.Set;

/**
 * Created by Ps1X on 16.02.2017.
 */
public class Puzirok {
    public static void main(String[] args) {
        int [] ints = puzirok();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    private static int[] puzirok () {
        int[] ints = {2,3,5,12,241,64,7};
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] < ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        return ints;
    }
}
