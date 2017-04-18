package codeFight.reverseVowelsOfString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ps1X on 03.04.2017.
 */
public class Main {
    public static void main(String[] args) {
    String s = "codefights";

    }
    public static String reverseVowelsOfString(String s) {
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('e');
        chars.add('i');
        chars.add('o');
        chars.add('u');
        char[] chars2 = s.toCharArray();
        for (int i = chars2.length ; i > 0 ; i--) {
            if (chars.contains(chars2[i])) {

            }
        }
    return s;
    }
}
