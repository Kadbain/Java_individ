package all_sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 26.05.2017.
 */
public class Insertion {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        sortInsertion(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    private static void sortInsertion(int[] a) {
        int i, j;
        int x;
        for (i = 0; i < a.length; i++) {
            x = a[i];
            for (j = i - 1; j >= 0 && a[j] > x; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = x;

        }
    }
}
