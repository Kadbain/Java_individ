package OOP.Test07;


import java.security.PublicKey;
import java.util.Objects;

/**
 * Created by Ps1X on 16.01.2017.
 */
public class Main {
    /* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/
    public static void main(String[] args) {
classs(new Lampa());

    }
    public static void classs(Object o) {
        if (o instanceof Cat) {
            System.out.println("Koshka");
        } else if (o instanceof Dog) {
            System.out.println("Sobaka");
        } else if (o instanceof Bird) {
            System.out.println("Ptblca");
        }else {
            System.out.println("lampa");
        }
    }
    public static class Cat{    }
    public static class Dog{}
    public static class Bird{}
    public static class Lampa{}
}