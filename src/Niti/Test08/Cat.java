package Niti.Test08;

/**
 * Created by Ps1X on 14.03.2017.
 */
/* Расставь вызовы методов join()
        1. В выполняющем классе создать метод investigateWorld(), который должен погружать нить в сон на 200 мс
        2. Создать класс Kitten, унаследовать его от Thread
        2.1 Создать конструктор с параметром String name, передавать параметр в конструктор суперкласса
        2.1 Переопределить метод run(), он должен:
        - выводить на экран надпись getName() + ", вылез из корзинки"
        - вызвать метод investigateWorld()
        3. Создать класс Cat, унаследовать его от Thread
        3.1 Создать 2 объекта Kitten
        3.2 Создать конструктор с параметром String name, передавать этот параметр в конструктор суперклассе
        3.3 В конструкторе проинициализируйте 2 объекта Kitten:
        - в параметр name первого объекта передавайте строку "Котенок 1, мама - " + getName()
        - в параметр name второго объекта передавайте строку "Котенок 2, мама - " + getName()
        3.4 Создать метод initAllKitten(), который запускает нити объектов Kitten
        3.5 Переопределить метод run(), он должен:
        - выводить в консоль надпись: getName() + " родила 2 котенка"
        - вызвать метод initAllKitten()
        - вывести в консоль надпись: getName() + ": Все котята в корзинке. " + getName() + " собрала их назад"
        4. В выполняющем методе создать 2 объекта Cat
        5. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
        5.1. Сначала кошка рожает котят.
        5.2. Потом все котята вылазят из корзинки в произвольном порядке.
        5.3. В конце кошка собирает их назад в корзинку.
        5.4. Все события для одной кошки могут быть перемешаны с событями для другой кошки.
        */
public class Cat extends Thread {
        Kitten cat;
        Kitten cat2;

    public Cat(String name) {
        super(name);
        this.cat = new Kitten("vasya - " + getName());
        this.cat2 = new Kitten("petya - " + getName());
        start();
    }
    public void initAllKitten() {
        cat.start();
        try {
            cat.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cat2.start();
        try {
            cat2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(getName() + "rodila 2 kotenka");
        initAllKitten();
        System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад" );
    }
}
