package codeFight.sortByString;

/**
 * Created by Ps1X on 21.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        String s = "weather";
        String t = "theerapyw";
        System.out.println(sortByString(s, t));
    }
    public static String sortByString(String s, String t) {
        char [] sortCopy = s.toCharArray();
        char [] copying = t.toCharArray();
        String result = "";
        for (int i = 0; i < sortCopy.length; i++) {
            for (int j = 0; j < copying.length; j++) {
                if (sortCopy[i] == copying[j]) {
                    result += copying[j];
                }
            }
        }
    return result;
    }
}

