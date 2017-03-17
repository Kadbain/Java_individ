package OOP.Test14_file;

import java.io.*;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Main {
    /* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;

        while (true) {
            try {
                String s4itivanie = reader.readLine();
                fileInputStream = new FileInputStream(s4itivanie);
            } catch (FileNotFoundException f) {
                System.err.println("File not found");
            }
           break;
        }
        while (fileInputStream.available() > 0) {
            System.out.print((char) fileInputStream.read());
        }

        fileInputStream.close();

    }
}