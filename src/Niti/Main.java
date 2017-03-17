package Niti;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Ps1X on 28.02.2017.
 */
// Обратить порядок слов в заданном строковом предложении.
// Вы можете предположить, что в предложении нет каких-либо ведущих, завершающих или повторяющихся пробелов.
// For sentence = "Man bites dog", the output should bereverseSentence(sentence) = "dog bites Man".
public class Main {
    public static void main(String args[]) {
        String s = "Man bites dog";
        System.out.println(reverseSentence(s));
    }

    public static String reverseSentence(String sentence) {
        String outPutText = "";
        String[] arr = sentence.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            outPutText += arr[i] + " ";
        }

        return outPutText;
    }

}
