package Test_sobesedovanie.vishka_math;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 07.07.2017.
 */
public class Test_factorial3 {
    static Map<Integer, BigInteger> cache = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(factorial(9));
        System.out.println(factorial(8));

    }
    private static BigInteger factorial(int i) {
        BigInteger big;
        if (i == 0) {
            return BigInteger.ONE;
        }
        if ((big = cache.get(i)) != null) {
            System.out.println("update");
    return big;
        }
        big = BigInteger.valueOf(i).multiply(factorial(i - 1));
        System.out.println("insert");
        cache.put(i, big);
        return big;
    }
}
