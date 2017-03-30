package codeFight.stringReformatting;

/**
 * Created by Ps1X on 28.03.2017.
 * Строка s содержит дефисы, которые разбивают ее на группы символов.
 * Вам дается целое число k, которое представляет количество символов в группах,
 * которое должен иметь ваш вывод. Ваша цель - вернуть новую строку, разбивающую s на группы с длиной k,
 * помещая дефисы с правильными интервалами.
 * При необходимости первая группа символов может быть короче, чем k.
 * Гарантируется отсутствие последовательных тире в s.
 * <p>
 * пример
 * <p>
 * Для s = "2-4a0r7-4k" и k = 4, выход должен быть
 * StringReformatting (s, k) = "24a0-r74k";
 * <p>
 * Входная строка «2-4a0r7-4k» разбивается на три группы с длиной 1, 5 и 2.
 * Так как k = 4, вам нужно разбить строку на две группы по 4 символа каждая, сделав выходную строку «24A0- R74k ".
 * <p>
 * Для s = "2-4a0r7-4k" и k = 3, выход должен быть
 * StringReformatting (s, k) = "24-a0r-74k".
 * <p>
 * Учитывая ту же входную строку и k = 3, разделите строку на группы из 2, 3 и 3 символов, чтобы получить выходную строку «24-a0r-74k».
 */
public class Main {
    public static void main(String[] args) {
        String s = "2-4a0r7-4k";
        int k = 3;
    }

    public static String stringReformatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                if (count == k) {
                    count = 0;
                    sb.append("-");
                }
                count++;
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}
