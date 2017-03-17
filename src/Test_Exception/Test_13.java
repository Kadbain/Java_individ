package Test_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1x on 15.12.2016.
 */
/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
F7
F8
F9
*/
public class Test_13 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        readData();
    }

    public static void readData () {
        List<Integer> list = new ArrayList<>();
        try {
                while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) {
                    break;
                } else {
                    int i = Integer.parseInt(s);
                    list.add(i);
                }
            }
        } catch (IOException e) {
                e.getMessage();
            } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println(list);
        }
    }

}
