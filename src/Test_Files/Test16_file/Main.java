package Test_Files.Test16_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 28.01.2017.
 */
/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()));
                String num;
                while((num = readerFile.readLine()) != null){
                    int x = Integer.parseInt(num);
                    if(x % 2 == 0) {
                        list.add(x);
                    }
                }
                break;
            } catch (FileNotFoundException f) {
                System.out.println("File not found!");
            }
        }

        Integer[] array = list.toArray(new Integer[list.size()]);
        sort(array);
        for (Integer i : array) {
            System.out.println(i);
        }

    }

    private static void sort(Integer[] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
                if (array[j] > array[i]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
