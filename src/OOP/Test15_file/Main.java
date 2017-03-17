package OOP.Test15_file;

import java.io.*;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Main {
    /* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        while (true) {
            String write = reader.readLine();
            if ("exit".equals(write)) {
                fileOutputStream.write(write.getBytes());
                break;
            } else {
                fileOutputStream.write((write + "\r\n").getBytes());
            }
        }
    }
}
