package Niti.Test09;

/**
 * Created by Ps1X on 14.03.2017.
 */
/* Часы
1. В выполняющем классе создать статическую переменную isStopped, подумать какого типа данная переменная
2. Проинициализировать переменную isStopped значением по-умолчанию
3. Создать класс Clock, унаследовать его от Thread
4. Создать конструктор класса Clock, установить макисмальный приоритет нити
5. Запускать нить в конструкторе
6. В классе Clock создать метод printTikTak. Реализуйте логику метода printTikTak:
6.1. Через первые полсекунды должна выводиться в консоль фраза: Tik.
6.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak.
7. Создать метод run и реализовать его функционал:
- пока переменная isStopped имеет значение false выполнять метод printTikTak
- отлавливать все checked исключения
8. В выполняющем методе:
- создать инстанс класса Clock
- погрузить главную нить в сон на 2 секунды
- поменять значение переменной isStopped на true
- вывести на экран надпись "Clock has to be stopped"
- подождать еще одну секунду
- вывести на экран надпись Double-check
- подумать, как исправить ошибку вывода в программе

private default protected public
*/
public class Main {
    static volatile boolean isStipped = false;
    public static void main(String[] args) {
        Clock clock = new Clock();
        try {
            Thread.sleep(2000);
            isStipped = true;
            clock.join();
            System.out.println("Clock has to be stopped");
            Thread.sleep(1000);
            System.out.println("Double-check");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
