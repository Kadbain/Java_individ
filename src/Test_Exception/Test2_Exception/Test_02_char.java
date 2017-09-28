package Test_Exception.Test2_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1x on 20.12.2016.
 */
/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/
public class Test_02_char {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = reader.readLine();
        char[] chars = s.toCharArray();// разбить по символьно строку
        String glaz = "";
        String soglaz = "";
        for (int i = 0; i < chars.length; i++) {
            if (isVowels(chars[i])) {
                glaz += chars[i] + " ";
            } else if (chars[i] == ' ') {
                continue;
            } else {
                soglaz += chars[i] + " ";
            }
        }
        System.out.println(glaz);
        System.out.println(soglaz);
    }

    public static boolean isVowels(char ch) {
        ch = Character.toLowerCase(ch);
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }
        return false;
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
}
