package Niti.Test18;

/**
 * Created by Ps1X on 29.04.2017.
 */
/* Thread.currentThread - всегда возвращает текущую нить
1. В выполнящем классе создать статическую переменную int count = 5
2. Создать вложенный класс NameOfDefferentThreads, который наследуется от Thread
3. В классе NameOfDefferentThreads реализовать метод printMsg:
- в методе printMsg создать переменную t, она должна хранить состояние текущей нити, подумать какой тип данной переменной
- в методе printMsg присвой переменной t текущую нить.
- в методе printMsg создать переменную name и присвоить ей имя нити, которая находится в переменной t
- в методе printMsg вывести в консоль значение переменной name
- в методе printMsg после всех действий поставь задержку в 1 миллисекунду.
3.1 Реализовать метод run(), он должен вызывать метод printMsg, count раз
4. В выполняющем методе:
- создать нить класса NameOfDefferentThreads и запустить её
- вызвать метод printMsg(), count раз
*/
public class Main {
    public static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        NameOfDefferentThreads thread = new NameOfDefferentThreads();
        thread.start();
        for (int i = 0; i < count; i++) {
            thread.printMsg();
        }
    }
}
class NameOfDefferentThreads extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < Main.count; i++) {
            try {
                printMsg();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void printMsg() throws InterruptedException {
    Thread t = Thread.currentThread();
    String name = Thread.currentThread().getName();
       System.out.println(name);
       Thread.sleep(100);

    }
}
