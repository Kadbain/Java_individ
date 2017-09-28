package zada4i_list_mas_br;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ps1X on 09.06.2017.
 */
public class Hash_equals {
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Hash_equals{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hash_equals main = (Hash_equals) o;

        if (a != main.a) return false;
        return b == main.b;
    }

    public static void main(String[] args) {
        Hash_equals main = new Hash_equals();
        main.setA(1);
        main.setB(2);
        Hash_equals main1 = new Hash_equals();
        main1.setA(1);
        main1.setB(2);


        if (main.hashCode() == main1.hashCode()) {
            System.out.println("main = " + main.hashCode() + " main2 = " + main1.hashCode());
            System.out.println("true");
        } else {
            System.out.println("main = " + main.hashCode() + " main2 = " + main1.hashCode());
            System.out.println("false");
        }

        main1.setA(2);
        main1.setB(1);

        // kollizia
        if (main.hashCode() == main1.hashCode()) {
            System.out.println("main = " + main.hashCode() + " main2 = " + main1.hashCode());
            System.out.println("true");
        } else {
            System.out.println("main = " + main.hashCode() + " main2 = " + main1.hashCode());
            System.out.println("false");
        }

        main1.setA(1);
        main1.setB(2);

        Set<Hash_equals> set = new HashSet<>();
        set.add(main);
        set.add(main1);
        System.out.println(set);
    }
}
