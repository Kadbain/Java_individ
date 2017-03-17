package OOP.Test09;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Main {
    /*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
    */
    public static void main(String[] args) {
        Drink alcoholicBeer = new AlcoholicBeer();
        System.out.println(alcoholicBeer);
    }

}
