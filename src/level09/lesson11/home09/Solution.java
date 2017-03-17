package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот». - createMap()
Получить из Map множество(Set) всех имен и вывести его на экран. - convertMapToSet(Map<String, Cat> map)
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
       Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vasya", new Cat("Vasya"));//напишите тут ваш код
        map.put("Vasya1", new Cat("Vasya1"));//напишите тут ваш код
        map.put("Vasya2", new Cat("Vasya2"));//напишите тут ваш код
        map.put("Vasya3", new Cat("Vasya3"));//напишите тут ваш код
        map.put("Vasya4", new Cat("Vasya4"));//напишите тут ваш код
        map.put("Vasya5", new Cat("Vasya5"));//напишите тут ваш код
        map.put("Vasya6", new Cat("Vasya6"));//напишите тут ваш код
        map.put("Vasya7", new Cat("Vasya7"));//напишите тут ваш код
        map.put("Vasya8", new Cat("Vasya8"));//напишите тут ваш код
        map.put("Vasya9", new Cat("Vasya9"));//напишите тут ваш код
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        for(Map.Entry<String, Cat> pair : map.entrySet()){
        Cat c = pair.getValue();
        set.add(c);//напишите тут ваш код
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
