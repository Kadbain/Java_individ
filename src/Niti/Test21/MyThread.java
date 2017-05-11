package Niti.Test21;

/**
 3.1 В классе MyThread:
 - создать переменную message = "inside MyThread "
 - реализовать мтеод run(): выводить 10 раз надпись message + i, i - число от 0 до 9.
 После каждого вывода вызывать метод sleep
 4. В выполняющем классе создать нить MyThread
 5. В выполняющем методе запустить нить
 5.1 Выводить 10 раз надпись message + i, i - число от 0 до 9.
 6. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится - продолжила метод main.
 7. Пример выходных данных:
 */
public class MyThread extends Thread{
    public static String message = "inside MyThread";

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            try {
                Main.sleep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
