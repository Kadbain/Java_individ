package OOP.Test09;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class AlcoholicBeer implements Drink{

    @Override
    public boolean isAlcoholic() {
        return true;
    }

    @Override
    public String toString() {
        if (isAlcoholic() == true) {
            return "is alkoholik";
        } else {
            return "not alkoholik";
        }
    }
}
