package Test_sobesedovanie.vishka_math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 16.02.2017.
 */
public class Test_fibona4i {
    public static void main(String[] args) {
        for (int i = 0; i <= 11; i++) {
            System.out.println(fibona4i(i));
        }
    }
    private static int fibona4i (int i) {
        int fib;
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 1;
        }
        return fib = fibona4i(i -1 ) + fibona4i(i - 2);
    }
}
