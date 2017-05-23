package arrays;

/**
 * Created by Ps1X on 16.05.2017.
 */
public class Main {
    static int x;
    static{
        x = 10;
    }

    public Main() {
        System.out.println("Main cons");
    }

    public static void method(){
        System.out.println("Main");
    }

}

class SubMain extends Main{
    int x;
    {
        x = 5;
    }

    public SubMain() {
        System.out.println("SubMain cons");
    }

    public static void main(String[] args) {
        Main main = new SubMain();
        System.out.println(main.x);
        main.method();
    }

    public static void method(){
        System.out.println("SubMain");
    }
}