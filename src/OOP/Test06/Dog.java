package OOP.Test06;

/**
 * Created by Ps1X on 16.01.2017.
 */
public class Dog extends  Pet {
    @Override
    public Dog getChild() {
        return new Dog();
    }
}
