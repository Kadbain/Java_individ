package OOP.Test32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 14.02.2017.
 */
/* Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию  factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
*/
public class Main {
    public static void main(String[] args) throws IOException {
        factorial();

    }

    public static void factorial() throws IOException {
        int i1 = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if (i < 0) {
            i = 0;
        } else if (i == 0)
            i = 1;
        else {
            for (int j = 1; j <= i; j++) {
                int temp = j;
                i1 = i1 * temp;

            }
        }
        System.out.println(i1);
    }
}
