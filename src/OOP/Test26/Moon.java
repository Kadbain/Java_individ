package OOP.Test26;

/**
 * Created by Ps1X on 09.02.2017.
 */
public class Moon implements Planet {
    private static Moon moon;

    public Moon() {
    }

    public static Moon getMoon() {
        if (moon == null) {
            moon = new Moon();
            return moon;
        } else
            return moon;
    }
}
