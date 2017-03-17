package Test_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Ps1x on 15.12.2016.
 */
/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
*/
public class Test_10 {
    public static void main(String[] args) {
processExceptions();
    }

    private static void processExceptions() {
        try {
            ioeception();
            fileNotFund();
            errror();;
        } catch (FileNotFoundException a) {
            a.getMessage();
        } catch (IOException | CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void ioeception() throws IOException {
        throw new IOException();
    }

    public static void fileNotFund() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void errror() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();

    }
}
