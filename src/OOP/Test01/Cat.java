package OOP.Test01;

/**
 * Created by Ps1X on 16.01.2017.
 */
public class Cat extends Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String met() {
       return super.met() + "!!!!";
    }
}
