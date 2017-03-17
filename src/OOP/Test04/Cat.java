package OOP.Test04;

/**
 * Created by Ps1X on 16.01.2017.
 */
public class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Boolean isDogNear (Dog dog ) {
        if (this.speed > dog.getSpeed()) {
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

}
