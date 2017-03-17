package Test_Exception;

/**
 * Created by Ps1x on 15.12.2016.
 */
/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/
public class Test_12 {
    public static void main(String[] args) {
        try {
            divisionByZero();
        } catch (ArithmeticException a){
            a.printStackTrace();
        }
    }
    public static void divisionByZero() {
        int a = 40/0;
        System.out.println(a);
    }
}
