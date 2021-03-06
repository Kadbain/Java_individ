package arrays.task06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 10 чисел и выводит их в убывающем порядке.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        for(int i = 0; i < array.length-1; i++){
            for(int s = 0; s < array.length-i-1; s++){
                if(array[s] < array[s+1]){
                    int tmp = array[s];
                    array[s] = array[s+1];
                    array[s+1] = tmp;
                }
            }}

        //Напишите тут ваш код
    }
}