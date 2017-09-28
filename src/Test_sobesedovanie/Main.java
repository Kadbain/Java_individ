package Test_sobesedovanie;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by Ps1X on 26.05.2017.
 */
public class Main {

}

abstract class Stroenie{

}

class Shop extends Stroenie{

}

class Build extends Stroenie{
    House kv = new House(8, 2, 2);
    House kv1 = new House(7, 4, 4);
    House kv2 = new House(1, 1, 3);

    String number;
    int proshad;

    public Build(String number, int proshad) {
        this.number = number;
        this.proshad = proshad;
    }

    @Override
    public String toString() {
        return "Square = " + proshad + "Count floors = " + number + "\n" + kv.toString() + "\n" + kv1.toString() + "\n" + kv2.toString();
    }
}
class House {
    Room kom = new Room(4, 2);
    Room kom2 = new Room(3, 1);

    int floor;
    int ploshad;
    int countNumber;

    public House(int floor, int ploshad, int countNumber) {
        this.floor = floor;
        this.ploshad = ploshad;
        this.countNumber = countNumber;
    }

    @Override
    public String toString() {
        return "Square = " + ploshad + "floor = " + floor + "\n" + kom.toString() + "\n" + kom2.toString();
    }
}
class Room{
    Shkaf shkaf;
    int ploshad;
    int okna;

    public Room(int ploshad, int okna) {
        this.ploshad = ploshad;
        this.okna = okna;
    }

    public void setShkaf(Shkaf shkaf) {
        this.shkaf = shkaf;
    }
}

class Shkaf {
    public Shkaf() {}
}

class Builder{
    public static void main(String[] args) {
        Build h1 = new Build("h1", 4);

        System.out.println(h1);
    }
}
