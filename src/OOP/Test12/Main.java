package OOP.Test12;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class Main {
    /*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
5. Создать класс GermanyTranslator, который наследуется от абстрактного класса Translator.
6. Реализовать все абстрактные методы.
7. Подумай, что должен возвращать метод getLanguage.
8. Программа должна выводить на экран "Я переводчик с немецкого".
*/
    public static void main(String[] args) {
        Translator germanyTranslator = new GermanyTranslator();
        Translator englishTranslator = new EnglishTranslator();

        System.out.println(germanyTranslator.translate()) ;
        System.out.println(englishTranslator.translate());

    }
}
