package Niti.Test01;

/**
 * Created by Ps1X on 28.02.2017.
 */
public class Main_02 {
    public static void main(String[] args) {
        Thread t = new Printer();
        t.start();
    }

    public static class Printer extends Thread{
        static {
            System.out.println("Static");
        }

        @Override
        public void run() {
            System.out.println("Print");
        }
    }
}
