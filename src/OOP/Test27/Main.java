package OOP.Test27;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 14.02.2017.
 */
/* Файл в статическом блоке
1. Инициализируйте константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считайте из файла с именем Constants.FILE_NAME все строки и добавьте их по-отдельности в List lines.
3. Отловите все исключения, которые могут возникнуть в программе.
3. Закройте поток ввода методом close().
4. В выполняющем методе выводите на экран все значения списка lines.
*/
public class Main {
    static List<String > s = new ArrayList<>();

    static {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(Constans.fileName));
                String s1;
                while ((s1 = reader.readLine()) != null) {
                    s.add(s1);
                }
                reader.close();
                break;

            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    Constans.fileName = reader.readLine();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (String s : s) {
            System.out.println(s);
        }
    }
}
