package Niti.Test12;

/**
 * Created by Ps1X on 31.03.2017.
 * 4. В классе Countdown:
 - создать приватную переменную int countFrom
 - создать конструктор и инициализировать в нём переменную countFrom
 - создать метод printCountdown()
 - реализуй логику метода printCountdown так, чтобы каждые полсекунды выводился объект из
 списка в обратном порядке - от переданного индекса до нуля.
 - реализовать метод run(), он должен вызывать метод printCountdown(), пока countFrom больше нуля
 */
public class Countdown implements Runnable {
    private int countFrom;

    public Countdown(int countFrom) {
        this.countFrom = countFrom;
    }

    @Override
    public void run() {
        if (countFrom > 0) {
            printCountdown();
            countFrom--;
        }
    }

    public void printCountdown() {
        for (int i = countFrom - 1; i >= 0; i--) {
            try {
                Thread.sleep(500);
                System.out.println(Main.list.get(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
