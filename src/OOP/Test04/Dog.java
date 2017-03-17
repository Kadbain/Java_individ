package OOP.Test04;

/**
 * Created by Ps1X on 16.01.2017.
 */
public class Dog {
    private String name;
    private int speed;
    public Boolean isCatNear(Cat cat) {
        if (this.speed > cat.getSpeed()){
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

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}
