package Test_sobesedovanie.Test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 17.05.2017.
 */
public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        String [] names = new String [5];
        addStr(names);
        sortStr(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
    private static void addStr (String [] str) {
        for (int i = 0; i < str.length; i++) {
            try {
                str[i] = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static boolean isGreaterThem (String a, String b) {
        return a.compareTo(b) > 0;
    }
    private static void sortStr (String [] str) {
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (isGreaterThem(str[j], str[j+1])) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str [j + 1] =temp;
                }
            }
        }
    }
}
