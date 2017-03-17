package OOP.Test22;

/**
 * Created by Ps1X on 02.02.2017.
 */
public class USD extends Money {
    public USD(int amount) {
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }
}
