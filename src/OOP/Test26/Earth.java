package OOP.Test26;

/**
 * Created by Ps1X on 09.02.2017.
 */
public class Earth implements Planet{
    private static Earth earth;

    public Earth() {
    }

    public static Earth getEarth() {
        if (earth == null) {
            earth = new Earth();
            return earth;
        } else
            return earth;
    }
}
