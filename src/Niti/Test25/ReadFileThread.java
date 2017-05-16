package Niti.Test25;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ps1X on 11.05.2017.3. Создай нить ReadFileThread, которая реализует
 интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
 3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
 3.2. Метод getFileContent должен возвращать содержимое файла.
 3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
 4. В выполняющем классе создать метод systemOutPrintln(String fileName), он должен:
 - создавать таск ReadFileThread
 - зассетить имя файла, с которым работает таск
 - запустить таск методом start интерфейса ReadFileInterface
 - ожидать завершение таска
 - вывести в консоль содержимое файла, использовать соответсвующий метод */
public class ReadFileThread implements ReadFileInterface, Runnable {


    private String fullFileName;
    public void setFileName(String fullFileName) {
        this.fullFileName = fullFileName;
    }

    @Override
    public String getFileContent() {
        String count;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fullFileName));

            while ((count = bufferedReader.readLine()) != null) {
                stringBuilder.append(count);
                stringBuilder.append(" ");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    @Override
    public void join() throws InterruptedException {

    }

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }
}
