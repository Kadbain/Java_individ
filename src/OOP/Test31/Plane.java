package OOP.Test31;

/**
 * Created by Ps1X on 14.02.2017.
 */
public class Plane implements Flyable {
    private int most;

    public int getMost() {
        return most;
    }

    public Plane(int most) {
        this.most = most;
    }


    @Override
    public String fly() {
        return "Plane is flying";
    }

    @Override
    public String toString() {
        return fly() + " with " + getMost();
    }

}
