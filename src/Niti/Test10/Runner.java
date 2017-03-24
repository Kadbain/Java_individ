package Niti.Test10;

/**
 5. В классе Runner создать параметры name, speed, stopwatch - подумать, какой тип данный у каждого параметра
 5.1 Создать конструктор для инициализация всех параметров класса Runner
 5.2 Сделать переменный name, speed приватными, создать для них геттеры
 5.3 Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
 5.4 Создать метод start(), он должен запускать нить stopwatch
 */
public class Runner {
    private String name;
    private double speed;
    private Stopwatch stopwatch;

    public Runner(String name, double speed) {
        this.name = name;
        this.speed = speed;
        this.stopwatch = new Stopwatch(this);
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public void start() {
        stopwatch.start();
    }
}
