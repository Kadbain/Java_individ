package Niti.Test13;

/**
 * Created by Ps1X on 31.03.2017.
 * 5. Создать класс Plane, унаследовать его от Thread
 6. В классе Plane:
 - создать конструктор с параметром name, передать переменную name в конструктор суперкласса
 - в конструкторе запустить нить
 - реализовать метод run():
 6.1 создать переменную isAlreadyTakenOff, подумать какой тип у переменной, инициализировать её значением по-умолчанию
 6.2 пока переменная isAlreadyTakenOff имеет значение false, выполнять следующее:
 - ЕСЛИ взлетная полоса свободна, занимать её
 - выводить на экран надпись getName() + " взлетает"
 - производить взлет самолета
 - выводить на экран надпись getName() + " уже в небе"
 - присвоить переменной isAlreadyTakenOff значение true
 - освободить взлетную полосу
 - ИНАЧЕ, если взлетная полоса занята самолетом
 - выводить на экран надпись getName() + " ожидает"
 - вызвать метод, который отвечает за ожидание
 */
public class Plane extends Thread{
    public Plane(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        boolean isAlreadyTakenOff = false;
        while (!isAlreadyTakenOff) {
            if (null == Main.RUNWAY.getRunway()) {
                Main.RUNWAY.setRunway(this);
                System.out.println(getName() + "vzlet");
                Main.takingOff();
                System.out.println(getName() + "v nebe");
                isAlreadyTakenOff = true;
                Main.RUNWAY.setRunway(null);
            } else if (!Main.RUNWAY.getRunway().equals(this)){
                System.out.println(getName() + "wait");
                Main.waiting();
            }
        }
    }
}
