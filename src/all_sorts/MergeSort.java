package all_sorts;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by Ps1X on 26.05.2017.
 */
public class MergeSort {
    int age;
    String name;

    public static void main(String[] args) {
        int[] a = new int[]{22, 12, 44, 40, 75, 76, 78, 77, 900, 2100, 2000, 2200, 1500, 1900};
        mergeSort(a, 0, a.length-1);
        for (int i : a) {
            System.out.print(i + ", ");
        }
    }

    private static void mergeSort(int[] a, int min, int max) {
        if (max <= min) {
            return;
        }
        int mid = min + (max - min) / 2;
        mergeSort(a, min, mid);
        mergeSort(a, mid + 1, max);
        int[] buf = Arrays.copyOf(a, a.length);
        for (int i = min; i <= max; i++) {
            buf[i] = a[i];
        }
        int i = min;
        int j = mid + 1;
        for (int k = min; k <= max; k++) {
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > max) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }

        }
    }
}
