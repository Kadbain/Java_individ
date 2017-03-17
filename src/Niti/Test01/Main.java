package Niti.Test01;

/**
 * Created by Ps1X on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Printer());
        Thread thread1 = new Thread(new Printer());
        Thread thread2 = new Thread(new Printer());
        thread.start();
        thread1.start();
        thread2.start();
    }

    public static class Printer implements Runnable{
        static {
            System.out.println("Static");
        }

        @Override
        public void run() {
            System.out.println("Print");
        }
    }
}
