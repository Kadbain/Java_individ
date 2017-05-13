package Test_sobesedovanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 12.05.2017.
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
public class Sort_string_int {
    public static void main(String[] args) throws IOException {
        List<String > sort_temp = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
        String string = reader.readLine();
        if (!string.isEmpty()) {
            sort_temp.add(string);
        } else {
            break;
        }
    }
    String [] sort = sort_temp.toArray(new String [sort_temp.size()]);

    }
    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException n) {
            return false;
        }
        return true;
    }
    private static boolean isString(String a, String b) {
        return a.compareTo(b) > 0;

    }
    private static void sort (String [] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                for (int j = 0; j < strings.length - 1; j++) {
                        if (isNumber(strings[j])) {
                            int a = Integer.parseInt(strings[i]);
                            int b = Integer.parseInt(strings[j]);
                            if (a > b) {
                                String t = strings[j];
                                strings[j] = strings[i];
                                strings[i] = t;
                            }
                        }
                    }
                }
            }
        }
    }
}
