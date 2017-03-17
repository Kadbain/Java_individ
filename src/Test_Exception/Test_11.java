package Test_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Ps1x on 15.12.2016.
 */
/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/
public class Test_11 {
    public static void main(String[] args) {
        processExceptions();
    }
        private static void processExceptions() {
            try {
                oeception();
                fileNotFnd();
                errroor();
                ;
            } catch (NullPointerException a) {
                System.out.println(a.getMessage());
            } catch (ArithmeticException a) {
                System.out.println(a.getMessage());
            } catch (RuntimeException a) {
                System.out.println(a.getMessage());
            }
        }

    public static void oeception()  {
        throw new RuntimeException();
    }

    public static void fileNotFnd() {
        throw new NullPointerException();
    }

    public static void errroor() {
        throw new ArithmeticException();

    }
}

