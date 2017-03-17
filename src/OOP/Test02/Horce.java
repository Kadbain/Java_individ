package OOP.Test02;

/**
 * Created by Ps1X on 16.01.2017.
 */
public class Horce {
    String name;
    Boolean flyable;
    Boolean runnable;

    public Horce(String name, Boolean flyable, Boolean runnable) {
        this.name = name;
        this.flyable = flyable;
        this.runnable = runnable;
    }

    public void proverka() {

//    - если переменная true, My name is + this.name + , i can fly =)
//    - если переменная false, My name is + this.name + , i cant fly =(
    if (flyable) {
        System.out.println("My name is " + this.name + ",i can fly");
    } else {
        System.out.println("My name is " + this.name + ", i cant fly");
    }
}
}
