package Niti.Test05;

/**
 * Created by Ps1X on 02.03.2017.
 */
public class PrintListThread extends Thread {
    public PrintListThread(String name) {
        super(name);
    }
    public void run() {
        Main.printList(Main.getList(5), getName());
    }
}
