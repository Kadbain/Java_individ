package Test_sobesedovanie.vishka_math;

/**
 * Created by Ps1X on 12.05.2017.
 */
public class Test_fib0na4i {
    public static void main(String[] args) {
        for (int i = 1; i <= 1 ; i++) {
            System.out.println(fibona4i(i));
        }
    }
    public static int fibona4i (int i) {
        int n;
        if ( i <= 0 ) {
            return 0;
        }
        if (i == 2 || i == 1) {
            return 1;
        }
        return n = fibona4i(i - 1) + fibona4i( i - 2);
    }
}
