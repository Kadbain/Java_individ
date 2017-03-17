package OOP.Test25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

/**
 * Created by Ps1X on 09.02.2017.
 */
/* Разные методы для разных типов
0. Создать метод print и перегрузить его для разных типов:
- print( Double value ), должен выводит на экран надпись "Это тип Double, значение " + value
- print( String value ), должен выводит на экран надпись "Это тип String, значение " + value
- print( short value ), должен выводит на экран надпись "Это тип short, значение " + value
- print( Integer value ), должен выводит на экран надпись "Это тип Integer, значение " + value
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String o = reader.readLine();
            if (!o.equals("exit")) {
                try {
                    if (o.contains(".")) {
                        print((double) Integer.parseInt(o));
                    } else if (Integer.parseInt(o) > 0 && Integer.parseInt(o) < 128) {
                        print((short) Integer.parseInt(o));
                    } else if (Integer.parseInt(o) >= 128) {
                        print(Integer.parseInt(o));
                    }
                } catch (NumberFormatException n) {
                    print(o);
                }
            } else
                break;
        }
    }

    public static void print(Double value) {
        System.out.println("eto tip double " + value);
    }

    public static void print(String value) {
        System.out.println("eto tip String " + value);
    }

    public static void print(short value) {
        System.out.println("eto tip short " + (short) value);
    }

    public static void print(Integer value) {
        System.out.println("eto tip Integer " + value);
    }
}
