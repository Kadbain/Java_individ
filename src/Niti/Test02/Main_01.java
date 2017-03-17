package Niti.Test02;

/**
 * Created by Ps1X on 28.02.2017.
 */
/* My second thread
1. Создать public static класс TestThread унаследовавшись от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread".
3. Метод run должен выводить в консоль "it's run method".
*/
public class Main_01 {
    public static void main(String[] args) {
        Thread thread = new TestThread();
        thread.start();
    }
    public static class TestThread extends Thread {
        static {
            System.out.println("its static block inside Test");
        }
        @Override
        public void run() {
            System.out.println("its run method");
        }
    }
}
