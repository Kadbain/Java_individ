package Niti.Test10;

/**
 4. В классе Stopwatch:
 - создать приватную переменную Runner owner;
 - создать приватную переменную int stepNumber;
 - создать конструктор и инициализировать в нём переменную owner;
 - создать метод doSeveralSteps, пока что без реализации;
 - создать метод run(), он должен:
 -- пока переменная isStopped равняется false выполнять метод doSeveralSteps;
 -- отлавливать все checked исключения.

 6. Реализовать метод doSeveralSteps:
 - увеличивать счетчик шага на один
 - записывать скорость бегуна в новую переменную
 - отправлять нить в сон на 1000 / speed1 мс
 - выводить на экран надпись owner.getName() + " делает шаг №" + stepNumber + "!"

 */
public class Stopwatch extends Thread {
    private Runner owner;
    private int stepNumber;

    public Stopwatch(Runner owner) {
        this.owner = owner;
    }

    public void doSeveralSteps() throws InterruptedException {
        stepNumber++;
        double speedNext = owner.getSpeed();
        Thread.sleep((long) (1000/speedNext));
        System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!" );
    }

    @Override
    public void run() {
        while (Main.isStopped == false) {
            try {
                doSeveralSteps();
            } catch (InterruptedException e) {

            }

        }
        super.run();
    }
}
