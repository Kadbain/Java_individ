package maps.task07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map,"Simn"));
        System.out.println(getCountTheSameLastName(map,"Sim"));
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim1", "Simn");
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");   //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int getCountTheSameFirstName = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if(name.equals(value)){
                getCountTheSameFirstName++;
            }
        } //напишите тут ваш код
        return getCountTheSameFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int getCountTheSameLastName = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getKey();
            if(familiya.equals(value))
            {
                getCountTheSameLastName++;
            }
        }
        return getCountTheSameLastName;

    }
}
