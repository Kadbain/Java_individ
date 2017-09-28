package Test_Exception;

import java.io.*;

/**
 * Created by Ps1X on 16.05.2017.
 */
/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/
public class Test14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream;

        while (true) {
            try {
                inputStream = new FileInputStream(reader.readLine());

                break;
            } catch (FileNotFoundException e) {
                System.out.println("файл не существует");
            }
        }
        OutputStream outputStream = new FileOutputStream(reader.readLine());
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
    }
}
