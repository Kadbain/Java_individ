package Niti.Test16;

/**
 * Created by Ps1X on 28.04.2017.
 */
/* А без interrupt слабо?
1. Создать класс TestThread, который реализует интерфейс Runnable
2. Нить должна выводить надпись Tik, каждые пол секунды
3. Создать метод ourInterruptMethod()
4. Сделать так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
5. В выполняющем классе запустить нить, она должна отработать 3 секунды, а потом прерваться
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TestThread());
        thread.start();
        Thread.sleep(3000);
        TestThread.ourInterruptMethod();
    }
}
