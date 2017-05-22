package arrays.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i = 0; i < arr.length; i++)
        {
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
        }
        for(int i = 0; i < 10; i++){
            arr1[i] = arr[i];
        }
        int j = 0;
        for(int i = 10; i <= 19; i++){

            arr2[j] = arr[i];
            j++;
        }

        for(j = 0; j <= 9; j++)
        {
            System.out.println(arr2[j]);
        }  //напишите тут ваш код

    }
}
