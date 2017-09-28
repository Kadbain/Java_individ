package patterns.composite;

import OOP.Test21.ComItem;
import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 29.05.2017.
 */
public class Composite {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle = new Triangle();
        Shape square3 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();
        Composiite composiite1 = new Composiite();
        Composiite composiite2 = new Composiite();
        Composiite composiite3 = new Composiite();
        composiite1.addComponent(square1);
        composiite1.addComponent(square2);
        composiite1.addComponent(triangle);
        composiite2.addComponent(square3);
        composiite2.addComponent(circle1);
        composiite2.addComponent(circle2);
        composiite2.addComponent(circle3);
        composiite3.addComponent(composiite1);
        composiite3.addComponent(composiite2);
        composiite3.draw();

    }
}

interface Shape {
    void draw();
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Привет я квадрат");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Привет я треугольник");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Привет я круг");
    }
}

class Composiite implements Shape {
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component : components) {
            component.draw();
        }
    }
}