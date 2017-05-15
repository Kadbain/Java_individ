package Test_sobesedovanie;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 12.05.2017.
 */
public class Test_factorial2 {
    public static Map<Integer, BigInteger> hranilishe = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(factorial(25));
        System.out.println(factorial(24));
    }
    private static BigInteger factorial (int i) {
        BigInteger factorial2;
        if (i == 0) {
            return BigInteger.ONE;
        }
        if ((factorial2 = hranilishe.get(i)) != null) {
            return factorial2;
        }
        factorial2 = BigInteger.valueOf(i).multiply(factorial(i - 1));
        System.out.println("добавлено в кэш");
        hranilishe.put(i, factorial2);
        return factorial2;
    }
}
