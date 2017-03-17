package OOP.Test28;

/**
 * Created by Ps1X on 07.02.2017.
 */
/* ООП - машинки
1.1 Создать вложенный класс Constants с переменными:
String WANT_STRING = "Я хочу ездить на ";
String LUXURIOUS_CAR = "роскошной машине";
String CHEAP_CAR = "дешевой машине";
String FERRARY_NAME = "Феррари";
String LANOS_NAME = "Ланосе";
1.2 Для вывода использовать можно только переменные из класса Constants.
2. Создать класс Ferrari, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
3. Создать класс Lanos, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
5. Создайте public static класс CheapCar(ДешеваяМашина).
6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
9. В класах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так,
чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
10. В выполняющем методе вызовите метод printlnDesire() у всех классов, в который он реализован.
*/
public class Main {
    public static void main(String[] args) {
    LuxuriousCar ferrari = new Ferrari();
        ferrari.printlnDesire();
        LuxuriousCar luxuriousCar = new LuxuriousCar();
        luxuriousCar.printlnDesire();
        CheapCar cheapCar = new CheapCar();
        CheapCar lanos = new Lanos();
        cheapCar.printlnDesire();
        lanos.printlnDesire();
    }

    static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        static String CHEAP_CAR = "дешевой машине";
        static String FERRARY_NAME = "Феррари";
        static String LANOS_NAME = "Ланосе";


    }

    static class Ferrari extends LuxuriousCar {
        @Override
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + " "+Constants.FERRARY_NAME);
        }
    }

    static class Lanos extends CheapCar {
        @Override
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + " " + Constants.LANOS_NAME);
        }
    }

    public static class LuxuriousCar {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + " " + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
            protected void printlnDesire () {
                System.out.println(Constants.WANT_STRING + " " + Constants.CHEAP_CAR);

        }
    }
}

