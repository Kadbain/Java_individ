package Niti;

import java.util.*;

import static javafx.scene.input.KeyCode.L;

/**
 * Created by Ps1X on 28.02.2017.
 */
class B{
    private B() {
        System.out.println("1");
    }
    protected B(String str) {
        System.out.println("2");
    }

}


public class Main extends B{
    public Main() {
        this ("smth");
    }
    public Main (String str) {
        super();
    }
    public static void main(String[] args) {
        Main m = new Main();
    }
}
