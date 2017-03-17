package OOP.Test18;

/**
 * Created by Ps1X on 31.01.2017.
 */
abstract public class AbstractRobot implements  Defensable, Attackable{
    private String name;
    private static int hitCount;

    public AbstractRobot(String name) {
        this.name = name;
    }

    public BodyPart attack() {
        hitCount = (int)(Math.random() * 4 + 1);
        if (hitCount == 1) {
            return BodyPart.gloves;
        } else if (hitCount == 2) {
            return BodyPart.feet;
        } else if (hitCount == 3) {
            return BodyPart.chest;
        } else {
            return BodyPart.head;
        }
    }

    public BodyPart defense() {
        hitCount = (int)(Math.random() * 4 + 1);
        if (hitCount == 1) {
            return BodyPart.gloves;
        } else if (hitCount == 2) {
            return BodyPart.feet;
        } else if (hitCount == 3) {
            return BodyPart.chest;
        } else {
            return BodyPart.head;
        }
    }

    public String getName() {
        return name;
    }
}
