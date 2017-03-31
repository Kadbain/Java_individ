package Niti.Test13;

/**
 * Created by Ps1X on 31.03.2017.
 * 3.1 В классе Runway:
 - создать приватную переменную типа Thread
 - для переменной создать геттер и сеттер
 */
public class Runway {
    private Thread runway;

    public Thread getRunway() {
        return runway;
    }

    public void setRunway(Thread runway) {
        synchronized (this) {
            this.runway = runway;
        }
    }
}
