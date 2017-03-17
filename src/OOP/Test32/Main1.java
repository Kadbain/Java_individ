package OOP.Test32;

/**
 * Created by Ps1X on 14.02.2017.
 */
/* Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию  factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
*/
public class Main1 {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }

    public static int fact(int i) {
        if(i == 0){
            return 1;
        }
        return i * fact(i - 1);
    }
}
