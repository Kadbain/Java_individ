package Test_Exception.Test2_Exception;

import java.util.*;

/**
 * Created by Ps1x on 20.12.2016.
 */
/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот». - createMap()
Получить из Map множество(Set) всех имен и вывести его на экран. - convertMapToSet(Map<String, Cat> map)
*/
public class Test_03_Collection {
    public static void main(String[] args) {
        Map<String , Cat> cats = createMap();
        System.out.println(convertMapToSet(cats));
    }

    private static Map createMap() {
        Map<String, Cat> cats2 = new HashMap<>();
        cats2.put("Dusya", new Cat("Dusya"));
        cats2.put("Jack", new Cat("Jack"));
        cats2.put("Marusya", new Cat("Marusya"));
        return cats2;
    }
    private static Set<Cat> convertMapToSet (Map<String , Cat> map) {
        Set<Cat> set = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().getValue());
        }
        return set;
    }

     public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

         @Override
         public String toString() {
             return name;
         }
     }
}

