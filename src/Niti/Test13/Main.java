package Niti.Test13;

/**
 * Created by Ps1X on 31.03.2017.
 */
/* Аэропорт
1. В выполняющем классе создать метод waiting(), который отправляет нить в сон на 100мс
2. В выполняющем классе создать метод takingOff(), который отправляет нить в сон на 100мс
3. Создать класс Runway (взлетная полоса)
3.1 В классе Runway:
- создать приватную переменную типа Thread
- для переменной создать геттер и сеттер
4. В выполняющем классе создать статическую переменную RUNWAY, подумать, какой тип у данной переменной
5. Создать класс Plane, унаследовать его от Thread
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
7. В выполняющем методе создать и запустить 3 нити(самолета)
*/
public class Main {
    public static volatile Runway RUNWAY = new Runway();
    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("plane 1");
        Plane plane2 = new Plane("plane 2");
        Plane plane3 = new Plane("plane 3");

    }
    public static void waiting() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void takingOff() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
