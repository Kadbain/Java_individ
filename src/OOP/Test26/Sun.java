package OOP.Test26;

/**
 * Created by Ps1X on 09.02.2017.
 */
public class Sun implements Planet {
    private static Sun sun;

    public Sun() {
    }

    public static Sun getSun() {
        if (sun == null) {
            sun = new Sun();
            return sun;
        } else
            return sun;
    }


}
