package OOP.Test34;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static Map<Double, BigDecimal> cache = new HashMap<>();

    private static BigDecimal factorial (double n) {
        BigDecimal result;
        if (n <= 0) {
            return BigDecimal.ONE;
        }
        if ((result = cache.get(n)) != null) {
            return result;
        }
        result = BigDecimal.valueOf(n).multiply(factorial(n-1));
        cache.put(n, result);
        return result;

    }
}

