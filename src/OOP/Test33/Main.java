package OOP.Test33;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    private static BigInteger factorial (int n) {
        BigInteger result;
        if (n == 0) {
            return BigInteger.ONE;
        }
        if ((result = cache.get(n)) != null) {
            return result;
        }
        result = BigInteger.valueOf(n).multiply(factorial(n-1));
        cache.put(n, result);
        return result;

    }
}
