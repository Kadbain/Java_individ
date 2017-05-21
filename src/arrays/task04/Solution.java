package arrays.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 5 чисел.
2. Ввести с клавиатуры 5 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)
        {
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
        }
        for(int i = 9; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
         //напишите тут ваш код

    }
}
