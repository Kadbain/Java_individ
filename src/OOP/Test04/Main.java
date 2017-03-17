package OOP.Test04;

/**
 * Created by Ps1X on 16.01.2017.
 */
/* Создать классы Cat и Dog с параметрами name и speed
Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kotya", 37);
        Dog dog = new Dog("Tomas", 32);
        if (cat.isDogNear(dog)) {
            System.out.println(cat.getName() + " winner");
        } else if (dog.isCatNear(cat)){
            System.out.println(dog.getName() + " winner");
        }
    }
}
