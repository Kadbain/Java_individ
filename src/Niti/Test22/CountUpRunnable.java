package Niti.Test22;

/**
 * Created by Ps1X on 05.05.2017.
 */
public class CountUpRunnable implements Runnable {
    private static int countIndexDown = 1;
    private Thread thread;

    public CountUpRunnable(String name) {
        this.thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public String toString() {
        return thread.getName() + ": " + countIndexDown;
    }

    @Override
    public void run() {
        while (countIndexDown <= 5) {
            System.out.println(toString());
            countIndexDown++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
