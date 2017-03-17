package Test_Files;

import java.io.*;

/**
 * Created by Ps1x on 22.12.2016.
 */
/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/
public class Test_02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String file1 = null;
        InputStream inputStream = null;
        while (true) {
            try {
                file1 = reader.readLine();
                inputStream = new FileInputStream(file1);
                break;
            } catch (FileNotFoundException f) {
                System.err.println("Не удается найти указанный файл");
            }
        }

        String file2 = reader.readLine();
        OutputStream outputStream = new FileOutputStream(file2);
        try {
            while (inputStream.available() > 0) {
                int bite = inputStream.read();
                outputStream.write(bite);
            }
        } catch (NullPointerException n) {
        }
    }
}
