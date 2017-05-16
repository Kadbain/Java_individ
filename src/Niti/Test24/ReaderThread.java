package Niti.Test24;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 08.05.2017.
 * 3. Создать класс ReaderThread, сделать его нитью
 * 3.0  Нить должна запускаться сразу при создании
 * 3.1. Каждая нить должна читать с консоли слова. Используйте BufferedReader reader.
 * 3.2. Используй static byte countReadStrings, чтобы посчитать, сколько слов уже считано с консоли всеми нитями.
 * 3.3 Реализуйте логику метода run:
 * 3.4. Пока нить не прервана (!isInterrupted) читайте с консоли слова и добавляйте их в поле List<String> result.
 * 3.5. Используй countReadStrings для подсчета уже считанных с консоли строк.
 * 3.6 Переопределить метод toString(), он должен выводить значение result у текущей нити
 * 4. В выполняющем методе создать переменную int count (к-во строк, которые необходимо ввести всем нитям),
 * присвоить ей значение введенное с консоли
 * 4.1 В выполняющем методе создать 3 нити
 * 4.2 Нити должны работать, пока count > countReadStrings, после этого остановить все дочерние нити
 * 4.3 Вывести значение каждой нити на экран в виде: "#1:" + нить
 */
public class ReaderThread extends Thread {
    List<String> result = new ArrayList<>();
    String stroka = "";

    public ReaderThread() {
        start();
    }

    @Override
    public void run() {

        try {
            while (!isInterrupted()) {
                stroka = Main.reader.readLine();
                result.add(stroka);
                Main.countReadStrings++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "" + result;
    }
}
