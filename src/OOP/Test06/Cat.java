package OOP.Test06;

/**
 * Created by Ps1X on 16.01.2017.
 */
public class Cat extends Pet{
    @Override
    public Cat getChild() {
        return new Cat();
    }
}
