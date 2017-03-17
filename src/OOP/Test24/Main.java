package OOP.Test24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 09.02.2017.
 */
/* Статики
1. В статическом блоке считайте две переменные с консоли number1 и number2 с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
4. Создать метод min(int a, int b), который должен вернуть минимальное значение между number1 и number2.
5. Создать статическую, неизменяемую переменную MIN и присвоить ей значение, которое возвращает метод min.
6. В выполняющем методе вывести значение переменной MIN.
*/
public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int MIN;
    static {
        try {
            int number = Integer.parseInt(reader.readLine());
            int number2 = Integer.parseInt(reader.readLine());
            MIN = min(number, number2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println(MIN);
    }

    public static int min (int a, int b) {
        if (a > b) {
            return b;
        } else
            return a;
    }

}
