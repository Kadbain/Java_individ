package OOP.Test36;

/**
 * Created by Ps1X on 25.02.2017.
 */
abstract class A {
    int a = 8;

    public A() {
        show();
    }

    abstract void show();
}

class B extends A {
    int a = 90;

    void show() {
        System.out.println("" + a);
    }

    public static void main(String args[]) {
        new B();
    }
}
