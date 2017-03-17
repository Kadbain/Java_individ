package OOP.Test11;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Main {
    /*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User, что бы он выводил следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        System.out.println(matrix.user);

        System.out.println(Matrix.user2);
    }
}
