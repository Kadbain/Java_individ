package Test_sobesedovanie.vishka_math;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 17.10.2017.
 */
public class allMathFunction {
    static Map<Integer, BigInteger> twiceNumbers = new HashMap<>();

    public static void main(String[] args) {

        int[] a = new int[]{2, 13, 22, 1, 3, 56, 21, 0, 5};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int i = 9;
        System.out.println(factorial(i));
        int i1 = 10;
        System.out.println(factorial(i1));
        System.out.println(fibona4i(9));
    }

    public static void bubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static BigInteger factorial(int a) {
        BigInteger result;
        if (a <= 1) {
            return BigInteger.ONE;
        }
        if (twiceNumbers.containsKey(a)) {
            System.out.println("don't put to map");
            return twiceNumbers.get(a);
        }
        result = BigInteger.valueOf(a).multiply(factorial(a - 1));
        System.out.println("put to map");
        twiceNumbers.put(a, result);
        return result;
    }

    public static int fibona4i(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }

        return fibona4i(a - 1) + fibona4i(a - 2);
    }

    public static int binarySearch(int i, int[] arrayI) {
        return binarySearch(i, arrayI, 0, arrayI.length - 1);
    }

    private static int binarySearch(int i, int[] arrayI, int min, int max) {
        if (min > max) {
            return -1;
        }
        int mid = min + ((max - min) / 2);
        if (i < arrayI[mid]) {
            return binarySearch(i, arrayI, min, mid - 1);
        } else if (i > arrayI[mid]) {
            return binarySearch(i, arrayI, mid + 1, max);
        } else
            return mid;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped = true;
        for (int i = n - 1; isSwapped; i--) {
            isSwapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
        }
    }
}
