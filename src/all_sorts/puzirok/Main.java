package all_sorts.puzirok;

/**
 * Created by Ps1X on 08.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 12, 7};
        puzirok(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    public static void puzirok(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j+1] > arr [j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
}
