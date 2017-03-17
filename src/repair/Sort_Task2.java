package repair;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 12.01.2017.
 */
public class Sort_Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] slova = new String [5];
        for (int i = 0; i < slova.length; i++) {
            slova[i] = reader.readLine();
        }
        sortName(slova);
        for (String slovum : slova) {
            System.out.println(slovum);
        }
    }
    public static boolean isGreatTham (String a, String b) {
        return a.compareTo(b) > 0;
    }
    public static void sortName (String [] sortA) {
        for (int i = 0; i < sortA.length - 1; i++) {
            for (int j = 0; j < sortA.length - i - 1; j++) {
                if (isGreatTham(sortA[j], sortA[j+1])) {
                    String temp = sortA[j];
                    sortA[j] = sortA[j + 1];
                    sortA[j + 1] = temp;
                }
            }
        }
    }
}
