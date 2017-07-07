package sets.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static class Cat{

    }
   static Cat cat1 = new Cat();
   static Cat cat2 = new Cat();
   static Cat cat3 = new Cat();
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()) {
            if(iter.next().equals(cat2)){
                iter.remove();
            }
        }
    //    cats.remove(cat1);//напишите тут ваш код. пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {

        Set<Cat> set = new HashSet<Cat>();
        set.add(cat1);//напишите тут ваш код. пункт 2
        set.add(cat2);//напишите тут ваш код. пункт 2
        set.add(cat3);//напишите тут ваш код. пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
       for (Cat x : cats){
                  System.out.println(x);// пункт 4
       }
    }

    // пункт 1
}
