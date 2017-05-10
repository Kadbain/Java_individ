package patterns.delegat;

/**
 * Created by Ps1X on 08.05.2017.
 */
public class Delegat {
    public static void main(String[] args) {
        A a = new A();
        a.f();
        Painter painter = new Painter();
        painter.setGraphics(new Triangle());
        painter.draw();
        painter.setGraphics(new Circle());
        painter.draw();

    }
}

class A {
    void f() {
        System.out.println("f()");
            /*
            *
            *
            *
            *
            *
             */
    }

}

class B {
    A a = new A();

    void f() {
        a.f();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics {

    @Override
    public void draw() {
        System.out.println("рисуем треугольник");
    }
}

class Square implements Graphics {

    @Override
    public void draw() {
        System.out.println("рисуем квадрат");
    }
}

class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("рисуем круг");
    }
}

class Painter {
    Graphics graphics;

    void setGraphics(Graphics g) {
        graphics = g;
    }

    void draw() {
        graphics.draw();
    }
}

