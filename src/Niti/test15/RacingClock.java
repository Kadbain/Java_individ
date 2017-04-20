package Niti.test15;

/**
 * Created by Ps1X on 03.04.2017.
 * 3. Реализуй логику метода run так, чтобы каждую секунду через пробел
 * выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
 * 4. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
 * Пример для countSeconds=4 : [4 3 2 1 Прервано!]
 * 5. Если нить работает менее 3.5 секунд, она должна завершиться сама.
 * Пример для countSeconds=3 : [3 2 1 Марш!]
 */
public class RacingClock extends Thread {
    @Override
    public void run() {
        try {
            while (Main.countSeconds > 0) {
                System.out.println(Main.countSeconds);
                Main.countSeconds--;
                sleep(1000);
            }
            System.out.println("Marsh!");
        } catch (InterruptedException e) {
            System.out.println("Prervano");
        }
    }
}
