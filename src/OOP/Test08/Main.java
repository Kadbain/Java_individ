package OOP.Test08;


/**
 * Created by Ps1X on 16.01.2017.
 */
/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class Main {
    public static void main(String[] args) {
isTrue(new Cov());
isTrue(new Whale());
isTrue(new Dog());
isTrue(new Bird());
    }
    public static void isTrue (Object o) {
        if (o instanceof Cov) {
            System.out.println("Korova");
        } else if (o instanceof Whale) {
            System.out.println("Kut");
        } else if (o instanceof Dog) {
            System.out.println("Sobaka");
        } else {
            System.out.println("Neizvestnoe zhblvotnoe");
        }
    }
    public static class Cov{}
    public static class Whale{}
    public static class Dog{}
    public static class Bird{}
}
