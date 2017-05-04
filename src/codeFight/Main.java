package codeFight;

public class Main {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(addTwoDigits(n));
        int n2 = 5;
        System.out.println(largestNumber(n2));
        int n3 = 3;
        int m = 10;
        System.out.println(candies(n3, m));
        String s = "CodefightsIsAwesome";
        String x = "IA";
        System.out.println(strstr(s, x));
    }

    public static int addTwoDigits(int n) {
        int n1 = n % 10;
        int n2 = n / 10;
        n = n1 + n2;
        return n;
    }

    public static int largestNumber(int n2) {
        int max = 1;
        for (int i = 0; i < n2; i++) {
            max = max * 10;
        }
        return max - 1;
    }

    public static int candies(int n, int m) {
        return m - (m % n);
    }

    public static int strstr(String s, String x) {
        char[] stroka = s.toCharArray();
        for (int i = 0; i < stroka.length; i++) {

        }
        return -1;
    }
}


