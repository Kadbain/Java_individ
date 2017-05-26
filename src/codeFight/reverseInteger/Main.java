package codeFight.reverseInteger;

/**
 * Created by Ps1X on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        int x = 8169;
        System.out.println(reverseInteger(x));
    }

    public static int reverseInteger(int x) {
        int i1 = 0;
        for (int i = x; i != 0; i = i / 10) {
            i1 = i1 * 10 + i % 10;
        }
        return i1;
    }
}
