package OOP.Test18;

/**
 * Created by Ps1X on 31.01.2017.
 */
public class BodyPart {
    private String  bodyPart;
    static final BodyPart gloves = new BodyPart("Рука");
    static final BodyPart feet = new BodyPart("нога");
    static final BodyPart head = new BodyPart("Голова");
    static final BodyPart chest = new BodyPart("Корпус");

    public BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return bodyPart;
    }
}
