package codeFight.missingNumber;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by Ps1X on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {5, 2, 1, 6, 3, 0};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int x = 0;
        for (int i : arr) {
            if(i != x){
                break;
            }
            x++;
        }
        return x;
    }
}
