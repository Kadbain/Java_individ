package OOP.Test13;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Today implements Weather{
    private String type;

    public Today(String type) {
        this.type = type;
    }

    @Override
    public String getWeatherType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s for today", getWeatherType());
    }
}
