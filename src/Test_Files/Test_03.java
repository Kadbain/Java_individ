package Test_Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ps1x on 22.12.2016.
 */
/* Задача по алгоритмам
        Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
        Пример ввода:
Вишня
1
Боб
3
        Яблоко
        2
        0
        Арбуз
        Пример вывода:
        Арбуз
        3
        Боб
        2
        Вишня
        1
        0
        Яблоко
        */
public class Test_03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                list.add(s);
            }


        }
        sort1(list);
        for (String s : list) {
            System.out.println(s);
        }

    }

    private static void sort1(List<String> list) {

        for (int i = 0; i < list.size(); i++) {
            if (isNumber(list.get(i))) {
                for (int j = 0; j < list.size(); j++) {
                    if (isNumber(list.get(j))) {
                        int a = Integer.parseInt(list.get(i));
                        int b = Integer.parseInt(list.get(j));
                        if (a < b){
                            String  temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);

                        }
                    }
                }
            } else {
                for (int j = 0; j < list.size(); j++) {
                    if(!isNumber(list.get(j))) {
                        if (!isGreaterThen(list.get(i), list.get(j))) {
                            String temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);
                        }
                    }
                }
            }
        }
    }

    private static boolean isNumber(String number) {
        try {
         Integer.parseInt(number);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    private static boolean isGreaterThen(String value1, String value2){
        // вернет true, если value1 больше value2
        // вернет false, если value2 больше value1
        return value1.compareTo(value2) > 0;
    }
}
