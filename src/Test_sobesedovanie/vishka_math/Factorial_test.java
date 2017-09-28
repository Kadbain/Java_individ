package Test_sobesedovanie.vishka_math;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
// [] [6] [8] []// 16
// [] [list Entry(30, 300), Entry(20, 200)] [list Entry(10, 100)]
// 10 100
// 30 300
// 20 200
// 50 500
/**
 * Created by Ps1X on 23.05.2017.
 */
public class Factorial_test {
    static Map<Integer, BigInteger> cache = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(9));

    }
    private static BigInteger factorial (int i) {
        BigInteger big;
        if (i == 0) {
            return BigInteger.ONE;
        }
        if ((big = cache.get(i)) != null ) {
            System.out.println("взято из кэша");
            return big;
        }
        big = BigInteger.valueOf(i).multiply(factorial(i - 1));
        System.out.println("добавлено в кэш");
        cache.put(i, big);
        return big;
    }
}
