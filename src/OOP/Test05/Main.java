package OOP.Test05;

/**
 * Created by Ps1X on 16.01.2017.
 */
/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/
public class Main {
    public static void main(String[] args) {
        Cov cov = new Cov();
        Cov whale = new Whale();
        System.out.println(cov.getName());
        System.out.println(whale.getName());
    }
}
