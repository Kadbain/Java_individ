package zada4i_list_mas_br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметри с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

public class Cats_sout_monitor
{
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String name = reader.readLine();


            if (name.isEmpty()) break;

            String a = reader.readLine();
            String w = reader.readLine();
            String t = reader.readLine();
            int age = Integer.parseInt(a);
            int weight = Integer.parseInt(w);
            int tailLength = Integer.parseInt(t);

            Cat cat = new Cat(name, age, weight, tailLength);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++)
        {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat
    {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}
