package all_sorts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 24.05.2017.
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
public class Bubble {
    static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        addList(names);
        String[] strings = names.toArray(new String[names.size()]);
        sort(strings);
        for (String s : strings) {
            System.out.println(s);
        }


    }

    private static void addList(List<String> names) {
        names.add("Вишня");
        names.add("1");
        names.add("Боб");
        names.add("35");
        names.add("3543");
        names.add("Яблоко");
        names.add("2");
        names.add("0");
        names.add("Арбуз");
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException n) {
            return false;
        }
        return true;
    }

    private static boolean isGreaterThem(String s, String s1) {
        return s.compareTo(s1) > 0;
    }

    private static void sort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                for (int j = 0; j < strings.length; j++) {
                    if (isNumber(strings[j])) {
                        int i1 = Integer.parseInt(strings[i]);
                        int i2 = Integer.parseInt(strings[j]);
                        if (i1 > i2) {
                            String s = strings[i];
                            strings[i] = strings[j];
                            strings[j] = s;
                        }
                    }
                }
            } else {
                for (int j = 0; j < strings.length; j++) {
                    if (!isNumber(strings[j])) {
                        if (!isGreaterThem(strings[i], strings[j])) {
                            String s = strings[i];
                            strings[i] = strings[j];
                            strings[j] = s;
                        }
                    }
                }
            }
        }
    }
}
