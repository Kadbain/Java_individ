package all_sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 24.05.2017.
 */
public class Selection {
    public static void main(String[] args) throws IOException {
        int [] ints = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        sortSelect(ints);
        for (int i : ints) {
            System.out.println(i);
        }
    }
    private static void sortSelect (int [] ints) {
        for (int i = 0; i < ints.length; i++) {
            int n = ints[i];
            int min = i;
            for (int j = 0; j < ints.length - 1; j++) {
                if (n > ints[j]) {
                    n = ints[j];
                    min = j;
                }
            }
            if (i != min ) {
                int temp = ints[i];
                ints[i] = ints[min];
                ints[min] = temp;
            }
        }
    }
}
