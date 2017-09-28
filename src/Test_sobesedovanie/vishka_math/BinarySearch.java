package Test_sobesedovanie.vishka_math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 07.07.2017.
 */
public class BinarySearch {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayI = {45, 49, 51, 90, 95, 201};
        System.out.println(binarySearch(90, arrayI));
    }

    private static int binarySearch(int i, int[] arrayI) {
        return binarySearch(i, arrayI, 0, arrayI.length - 1);
    }

    private static int binarySearch(int i, int[] arrayI, int min, int max) {
        if (min > max) {
            return -1;
        }
        int mid = min + ((max - min) / 2);
        if (i < arrayI[mid]) {
            return binarySearch(i, arrayI, min, mid - 1);
        } else if (i > arrayI[mid]) {
            return binarySearch(i, arrayI, mid + 1, max);
        } else
            return mid;
    }
}

class A {
    String name;
    String age;
    static A b = new A("b", "23");

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        A a = new A("a", "12");
        List<Integer> list = new ArrayList<>();
        System.out.println(a);
        Integer c = 2;
        a.someThing(a, c, list);
        System.out.println(a + " " + c);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public A(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private void someThing(A a, Integer i, List list) {
      a = new A("v", "20");
      i = 3;

      list.add(1);
      list.add(2);
    }
}
