package zada4i_list_mas_br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 12.01.2017.
 */
public class Task1 {
static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
