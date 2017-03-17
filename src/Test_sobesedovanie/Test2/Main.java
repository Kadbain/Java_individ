package Test_sobesedovanie.Test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 07.02.2017.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer i = Integer.parseInt(reader.readLine());
        Integer i1 = Integer.parseInt(reader.readLine());
        System.out.println(NOD(i,i1));
    }

    public static int NOD (int i, int i1) {
        while (i != 0 & i1 != 0) {
            int tmp = i%i1;
            i = i1;
            i1 = tmp;
        }
        return i;
        }
    }

