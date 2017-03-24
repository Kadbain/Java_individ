package codeFight.findNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ps1X on 17.03.2017.
 */
/* Попытайтесь решить эту задачу с линейной сложностью и используя O (1) дополнительную память, так как это то, что вас попросят сделать во время реального интервью.

У вас есть массив, содержащий 2 * n + 2 положительных чисел, в которых n чисел встречаются дважды, а два других числа встречаются только один раз и различны. Найдите два разных числа и верните их в порядке возрастания.
*/
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 1, 4, 3, 6};
        for (int i : findTheNumbers(a)) {
            System.out.println(i);
        }
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

