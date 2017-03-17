package OOP.Test32;

/**
 * Created by Ps1X on 14.02.2017.
 */
public class Recrusive1 {
    public static void main(String[] args) {
        System.out.println(factorial2(8));
    }
    public static int factorial2( int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial2(i - 1);
    }
}
