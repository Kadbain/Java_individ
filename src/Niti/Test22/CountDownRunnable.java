package Niti.Test22;

/**
 2. В классе CountDownRunnable:
 - создать приватную переменную countIndexDown типа int и присвоить ей значение переменной number
 - создать переменную private Thread t
 - в конструкторе инициализировать переменную t нитью с таском класса CountDownRunnable и именем,
 которое приходит в параметрах конструктора. Запустить нить.
 - переопределить toString(), что бы он выводил строки в следующем виде: t.getName() + ": " + countIndexDown;
 - реализовать метод run(), он должен:
 -- пока переменная countIndexDown не равняется 0:
 -- выводить на экран toString()
 -- уменшать переменную countIndexDown на один
 -- отправлять нить в сон на пол секунды
 По образу и подобию CountDownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number
 */
public class CountDownRunnable implements Runnable {
    private static int countIndexDown = Main.number;
    private Thread thread;

    public CountDownRunnable(String name) {
        this.thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public String toString() {
        return thread.getName() + ": " + countIndexDown;
    }

    @Override
    public void run() {
        while (countIndexDown != 0) {
            System.out.println(toString());
            countIndexDown--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
