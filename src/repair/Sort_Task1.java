package repair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/**
 * Created by Ps1X on 12.01.2017.
 */
public class Sort_Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] myarray = new int[10];
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = Integer.parseInt(reader.readLine());

        }
        buble(myarray);
        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i]);
        }
    }
    public static void buble(int[] buble) {
        for (int i = 0; i < buble.length -1; i++) {
            for (int j = 0; j < buble.length - i - 1; j++) {
                if (buble[j] > buble[j + 1]) {
                    int temp = buble[j];
                    buble[j] = buble[j + 1];
                    buble[j + 1] = temp;
                }
            }
        }
    }
}
