package Test_sobesedovanie.Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Ps1X on 02.02.2017.
 */
/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer i = Integer.parseInt(reader.readLine());
        Integer i2 = Integer.parseInt(reader.readLine());
        System.out.println(NOD(i, i2));


    }

    public static int NOD (int i,int i2) {
        while (i != 0 & i2 != 0) {
            int tmp = i%i2;
            i = i2;
            i2 = tmp;
        }
        return i;
    }
}


