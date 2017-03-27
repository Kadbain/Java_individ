package codeFight.amendTheSentence;

/**
 * Created by Ps1X on 24.03.2017.
 * Вы получили строку s, которая должна быть предложением.
 * Однако кто-то забыл поставить пробелы между разными словами,
 * и по какой-то причине они заглавили первую букву каждого слова.
 * Вернуть предложение после внесения следующих поправок:

 Поместите пробел между словами.
 Преобразуйте прописные буквы в нижний регистр.
 */
public class Main {
    public static void main(String[] args) {
    String s = "AsdasdadAsdaGsdaSfqweqS";
        System.out.println(amendTheSentence(s));
    }
    public static String amendTheSentence(String s) {
        String s1 = "";
        char [] chars = s.toCharArray();
        if (chars[0] == Character.toUpperCase(chars[0])) {
            s1+= Character.toLowerCase(chars[0]);
        } else {
            s1+= chars[0];
        }
        s1 += chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == Character.toUpperCase(chars[i])) {
                Character.toLowerCase(chars[i]);
                s1 += " " + chars[i];
            } else {
                s1 += chars[i];
            }

        }
    return s1;
    }

}
