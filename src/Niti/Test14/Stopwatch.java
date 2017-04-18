package Niti.Test14;

/**
 * Created by Ps1X on 03.04.2017.
 * 3. Напиши реализацию метода run в нити Stopwatch (секундомер).
 4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
 5. Выведи количество секунд в консоль.
 */
public class Stopwatch extends Thread {
    int sec = 0;
    @Override
    public void run() {
        try {
            while (true) {
                sec++;
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(sec);
        }

    }

}
