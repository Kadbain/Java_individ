package lists.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int N = Integer.parseInt(s1);
        int M = Integer.parseInt(s2);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++)
        {
            list.add(list.remove(0));
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}
