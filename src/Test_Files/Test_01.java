package Test_Files;

import java.io.*;

/**
 * Created by Ps1x on 22.12.2016.
 */
/*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        InputStream inputStream = new FileInputStream(filename1);
        OutputStream outputStream = new FileOutputStream(filename2);

        int count = 0;

        while(inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);

            count++;
        }

        System.out.println("Copies byte: " + count);
    }
}
