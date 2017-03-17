package Niti.Test03;

/**
 * Created by Ps1X on 28.02.2017.
 */
/* Вывод стек-трейса
1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль свой стек-трейс.
*/
public class Main {
    public static void main(String[] args) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            System.out.println(stackTraceElement);
        }
        Thread thread = new Thread(new SpecialThread());
        thread.start();
    }
    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            for (StackTraceElement s : Thread.currentThread().getStackTrace()) {
                System.out.println(s);
            }
        }
    }
}
