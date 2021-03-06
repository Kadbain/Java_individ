package Test_sobesedovanie.tasks_for_interview;

/**
 * 1. Если мы из корректно записанного арифметического выражения, содержащего числа, знаки операций и открывающие и закрывающие
 * круглые скобки выбросим числа и знаки операций, а затем запишем оставшиеся в выражении скобки без пробелов между ними, то
 * полученный результат назовем правильным скобочным выражением [скобочное выражение "(()(()))" - правильное, а "()(" и "())(" - нет].
 * Найти число правильных скобочных выражений, содержащих N открывающихся и N закрывающихся скобок. N вводится с клавиатуры. N неотрицательное целое число.
 * <p>
 * Пример:
 * N =  1 (по одной скобке открывающейся и закрывающеся) - ответ 1
 * () -
 * )( -
 * )) -
 * (( -
 * Только один правильный вариант
 * <p>
 * Для введенного числа 2 - 2 :
 * ()()
 * (())
 * То есть только два варианта, когда все открытые скобки правильно открываются/закрываются.
 * И так далее.
 */
public class String_char {
    public static void main(String[] args) {
        System.out.println(katalan(8)); // print
    }
    private static int katalan(int n) {
        int i, sum;
        if (n <= 0) // interrupt recursion
            return 1;
        sum = 0;
        for (i = 0; i < n; i++)
            sum += katalan(i) * katalan((n - 1) - i); // Catalan sequence
        return sum;
    }
}

