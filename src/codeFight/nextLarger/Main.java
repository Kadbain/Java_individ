package codeFight.nextLarger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by Ps1X on 24.03.2017.
 * Если задан массив a, состоящий из отдельных элементов,
 * найдите следующий больший элемент для каждого элемента массива в том порядке,
 * в котором они появляются в массиве, и возвратите результаты в виде нового массива одинаковой длины.
 * Если элемент не имеет больший элемент справа от него, поместите -1 в соответствующую ячейку массива результатов.
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = {10, 3, 12, 4, 2, 9, 13, 0, 8, 11, 1, 7, 5, 6};
        for (int i : nextLarger(ints)) {
            System.out.println(i);
        }

    }

    public static int[] nextLarger(int[] a) {
        int[] mas = new int[a.length];
        int x = 0;
        for (int i = a.length-1; i >= 0; i--) {
            while(x > 0 && a[i] > mas[x-1]) x--;
            int number = 0;
            if(x > 0){
                number = mas[x-1];
            } else number = -1;

            mas[x++] = a[i];
            a[i] = number;
        }

        return a;
    }
}
