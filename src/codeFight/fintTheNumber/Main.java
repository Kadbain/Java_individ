package codeFight.fintTheNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ps1X on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        int [] nums = {491514490, 966431957, 133599290, 387327914,
                109997139, 966431957, 489426480, 695254319, 712693656,
                109997139, 122504290, 953777790, 489426480, 695254319,
                387327914, 133599290, 122504290, 712693656};
        System.out.println(findTheNumbers(nums));
    }

    public static int[] findTheNumbers(int[] a) {
        Arrays.sort(a);
        List<Integer> list = new ArrayList<>();
        if (a.length == 0) {
            return a;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                list.add(a[i]);
            } else i++;
        }
        if(a[a.length-1] != a[a.length-2]) {
            list.add(a[a.length -1]);
        }
        int[] findNumbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            findNumbers[i] = list.get(i);

        }
        return findNumbers;
    }
}
