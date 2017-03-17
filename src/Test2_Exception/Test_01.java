package Test2_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Ps1x on 20.12.2016.
 */
/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/
public class Test_01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Date date;
        while (true) {
            try {
                date = new Date(reader.readLine());
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Retry");
            }
        }


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM, dd, yyyy", Locale.CANADA);
        System.out.println(simpleDateFormat.format(date).toUpperCase());

    }
}
