package Niti.Test11;

/**
 3. В классе Clock:
 - создать параметры cityName, hours, minutes, seconds - пдумать, какой тип у каждого параметра
 - создать конструктор и инициализировать все параметры класса, так же запустить нить в конструкторе
 - создать и реализовать логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
 Пример:
 В г. Лондон сейчас 23:59:58!
 В г. Лондон сейчас 23:59:59!
 В г. Лондон сейчас полночь!
 В г. Лондон сейчас 0:0:1!
 - создать метод run:
 -- пока переменная isStopped равняется false выполнять метод printTime;
 -- отлавливать все checked исключения.
 */
public class Clock extends Thread {
    private String cityName;
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(String cityName, int hours, int minutes, int seconds) {
        this.cityName = cityName;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public void printTime() throws InterruptedException {
        Clock.sleep(1000);
        seconds++;
   if (seconds == 60) {
        seconds = 0;
        minutes++;
    }
    if (minutes == 60) {
       minutes = 0;
       hours++;
    }
    if (hours == 24) {
       hours = 0;
    }
    if (seconds == 0 && minutes == 0 && hours == 0) {
        System.out.println(String.format("%s, polno4", cityName));
    } else {
//        System.out.println(String.format("v gorode %s sey4as %d:%d:%d", cityName, hours, minutes, seconds));
        System.out.printf("v gorode %s sey4as %d:%d:%d \n", cityName, hours, minutes, seconds);
    }

    }

    @Override
    public void run() {
        while (!Main.isStopped) {
            try {
                printTime();
            } catch (InterruptedException e) {}
        }
    }
}
