package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    static Cat cat1 = new Cat();
    static Cat cat2 = new Cat();
    static Cat cat3 = new Cat();
    static Cat cat4 = new Cat();
    static Dog dog1 = new Dog();
    static Dog dog2 = new Dog();
    static Dog dog3 = new Dog();
    public static class Cat{}
    public static class Dog{}
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("----------------------------------------------");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(cat1);//напишите тут ваш код. пункт 2
        result.add(cat2);//напишите тут ваш код. пункт 2
        result.add(cat3);//напишите тут ваш код. пункт 2
        result.add(cat4);//напишите тут ваш код. пункт 2
        return result;

    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(dog1);//напишите тут ваш код. пункт 2
        result.add(dog2);//напишите тут ваш код. пункт 2
        result.add(dog3);//напишите тут ваш код. пункт 2
        return result;

    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> obj = new HashSet<Object>();
        obj.addAll(cats);
        obj.addAll(dogs);

        //напишите тут ваш код
        return obj;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets)
    {
     for (Object x : pets)
     {
     System.out.println(x);//напишите тут ваш код
     }
    }

    //напишите тут ваш код
}
