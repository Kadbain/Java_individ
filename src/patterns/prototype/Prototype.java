package patterns.prototype;

/**
 * Created by Ps1X on 29.05.2017.
 */
public class Prototype {
    public static void main(String[] args) {
        Human original = new Human(26, "Jenya");
        System.out.println(original);
        Human copy = (Human) original.copy();
        System.out.println(copy);

        HumanFactory humanFactory = new HumanFactory(copy);
        humanFactory.setPrototype(new Human(30, "Jackson"));
        Human h2 = humanFactory.makeCopy();
        System.out.println(h2);
    }
}

interface Copyable {
    Object copy();
}

class Human implements Copyable {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }
}

class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    Human makeCopy() {
        return (Human) human.copy();
    }
}
