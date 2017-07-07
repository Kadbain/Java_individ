package OOP.Test31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ps1X on 14.02.2017.
 */
/* Осваивание статического блока
0. Создать интерфейс Flyable с методом String fly();
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс Flyable.
2. Класс Plane должен иметь 1 конструктор с приватным параметром int - количество перевозимых пассажиров.
2.1 В классе Plane метод fly() должен возвращать строку "Plane is flying";
2.2 В классе Plane переопределить метод toString(), что бы он возвращал строку: fly() + " with " + getPasenger();
3.1 Класс Helicopter должен иметь 1 конструктор с приватным параметром int - количество перевозимых пассажиров.
3.2 В классе Helicopter метод fly() должен возвращать строку "Helicopter is flying";
3.3 В классе Helicopter переопределить метод toString(), что бы он возвращал строку: fly() + " with " + getPasenger();
4. В классе Cats_sout_monitor создать статическую переменную Flyable result;
5. В статическом методе reset класса Cats_sout_monitor:
5.1. В бесконечном цикле считывать с консоли параметр типа String. Параметр может быть "plane" или "helicopter".
5.2. Если параметр равен "helicopter", то считать второй параметр типа int, статическому объекту Flyable result присвоить объект класса Helicopter.
5.3. Если параметр равен "plane", то считать второй параметр типа int, статическому объекту Flyable result присвоить объект класса Plane.
5.3. Иначе завершить ввод.
6. В статическом блоке инициализировать Flyable result вызвав метод reset, отловить все checked исключения.
7. В выполняющем методе сделать вывод на экран строку: The program worked! .
*/
public class Main {
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println(" the program work");

    }
    public static void reset () throws IOException {
        Flyable result;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s1 = reader.readLine();
            int i1;
            if (s1.equals("helicopter")) {
                i1 = Integer.parseInt(reader.readLine());
                result = new Helicopter(i1);
                System.out.println(result);
            } else if (s1.equals("plane")) {
                i1 = Integer.parseInt(reader.readLine());
                result = new Plane(i1);
                System.out.println(result);
            } else {
                break;
            }
        }
    }
}
