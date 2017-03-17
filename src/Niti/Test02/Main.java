package Niti.Test02;

/**
 * Created by Ps1X on 28.02.2017.
 */
/* My first thread
        Создать public static class TestThread - нить с помощью интерфейса Runnable.
        TestThread должен выводить в консоль "My first thread".
        */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new TestTh());
        thread.start();
    }
    public static class TestTh implements Runnable {

        @Override
        public void run() {
            System.out.println("my first thread");
        }
    }
}
