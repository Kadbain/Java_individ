package OOP.Test10;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Main {
    /* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/
    public static void main(String[] args) {
        Drink cola = new Cola();
        Drink beer = new Beer();
        print(cola);
        print(beer);

    }
    public static void print (Drink b1) {
        if (b1.isAlcoholic()) {
            System.out.println(b1.getClass().getSimpleName() + " is Alkohol");
        } else {
            System.out.println(b1.getClass().getSimpleName() + " no Alkohol");
        }
    }
}
