package codeFight.removeDuplicateAdjacent;

/**
 * Created by Ps1X on 31.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        String s = "cooodefightssforrrcodee";
        System.out.println(removeDuplicateAdjacent(s));
    }
    static String removeDuplicateAdjacent(String s) {
//        if (s.length() == 1) {
//            return s;
//        }
//        char[] chars = s.toCharArray();
//        String result = "";
//        boolean recursiveCall = false;
//
//        for (int i = 0; i < chars.length - 1; i++) {
//            if (chars[i] != chars[i + 1]) {
//                if (i == 0) {
//                    result += chars[i];
//                } else if (chars[i] != chars[i - 1]) {
//                    result += chars[i];
//                }
//                if (i == chars.length - 2) {
//                    result += chars[i + 1];
//                }
//            } else recursiveCall = true;
//        }
//        return recursiveCall ? removeDuplicateAdjacent(result) : result;

        for (int i = 0; i < s.length(); i++) {
            s = s.replaceAll("(.)(\\1)+", "");
        }

        return s;
    }
}
