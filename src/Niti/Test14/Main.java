package Niti.Test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 03.04.2017.
 */
/* Считаем секунды
1. Создать класс Stopwatch, унаследовать его от Thread.
2. В выполняющем классе ввести с клавиатуры строку
3. Напиши реализацию метода run в нити Stopwatch (секундомер).
4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
5. Выведи количество секунд в консоль.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        String s = reader.readLine();
        stopwatch.interrupt();
    }
}
