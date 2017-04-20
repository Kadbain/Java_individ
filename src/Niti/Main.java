package Niti;

import java.util.*;

import static javafx.scene.input.KeyCode.L;

/**
 * Created by Ps1X on 28.02.2017.
 */
// Обратить порядок слов в заданном строковом предложении.
// Вы можете предположить, что в предложении нет каких-либо ведущих, завершающих или повторяющихся пробелов.
// For sentence = "Man bites dog", the output should bereverseSentence(sentence) = "dog bites Man".
// O(1) - O(N) get()
//             set(500, 56)
//             add(500, 3)
//             remove()

// [] [] [] [8](List el2) [12](List el1, el4) [16](List el3) [] [] // 30   // O(1) O(n)
//


public class Main {
//    public static void main(String args[]) {
//        int f;
//        f = 5;
//        f = ++f + f++ + f;
//
//
//        System.out.println(f);
//        System.out.println(f);
//        int [] myarray = new int[4];
//    }
    final int a = 5;
     final String name = " ";

byte[] a = {50,51,52};
String s = new String (a, 2,4);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Main main = (Main) o;

        if (a != main.a) return false;
        return name != null ? name.equals(main.name) : main.name == null;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
