package OOP.Test17;

/**
 * Created by Ps1X on 31.01.2017.
 */
public class Person implements RepkaItem{
    String name;
    String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }
    public void pull(Person person) {
        System.out.println(this.name + " za " + person.getNamePadezh());

    }
}
