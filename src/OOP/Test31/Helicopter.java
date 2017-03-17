package OOP.Test31;

/**
 * Created by Ps1X on 14.02.2017.
 */
public class Helicopter implements Flyable {
    private int most;

    public Helicopter(int most) {
        this.most = most;
    }


    public int getMost() {
        return most;
    }

    @Override
    public String fly() {
        return "Helicopter is flying";
    }

    @Override
    public String toString() {
        return fly() + " with " + getMost();
    }

}
