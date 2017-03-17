package OOP.Test22;

/**
 * Created by Ps1X on 02.02.2017.
 */
public class Hrivna extends Money {
    public Hrivna (int amount) {
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "HRN";
    }
}
