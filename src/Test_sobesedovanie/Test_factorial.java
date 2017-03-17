package Test_sobesedovanie;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 16.02.2017.
 */
public class Test_factorial {
    public static void main(String[] args) {
        System.out.println(factorial(25));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    private static BigInteger factorial(int n){
        BigInteger res;

        if(n == 0){
            return BigInteger.ONE;
        }
        if((res = cache.get(n)) != null) return res;
        res = BigInteger.valueOf(n).multiply(factorial(n - 1));
        // res = n * factorial(n - 1);
        cache.put(n, res);
        return res;
    }
}
