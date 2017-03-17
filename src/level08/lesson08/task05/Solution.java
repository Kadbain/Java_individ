package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static Map<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;

    }

    public static Map<String, String> removeTheFirstNameDuplicates(Map<String, String> map)
    {
        //напишите тут ваш код
//        String[] s = new String[map.size()];
//        int i = 0;
//        for (Map.Entry<String, String> entry : map.entrySet())
//        {
//            s[i] = entry.getValue();
//            i++;
//        }

        Map<String, String> copy_map = new HashMap<>();
        for(Map.Entry<String, String> pair : map.entrySet()) {
            int count = 0;
            for (String x : map.values()) {
                if (pair.getValue().equals(x)) {
                    count++;
                }
            }
            if (count > 1) {

            } else {
                copy_map.put(pair.getKey(), pair.getValue());
            }
        }
        return copy_map;
    }



    public static void main(String[] args) {
        Map<String,String> map = createMap();
       map = removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}