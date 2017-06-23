package maps.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Создадим карту и внесем в неё список в формате Город-Фамилия
        HashMap<String,String> map = new HashMap<String, String>();
        //считаем с клавиатуры и запишем данные

        while (true){
            String s1= reader.readLine();
            if (s1.isEmpty()) break;
            else {
                String s2 = reader.readLine();
                map.put(s1,s2);
            }
        }


        //узнаем вопрос про город
        String city = reader.readLine();

        //выводим город
        for (Map.Entry<String,String> pair : map.entrySet()){
            if (pair.getKey().equals(city)) System.out.println(pair.getValue());
        }

    }
}
