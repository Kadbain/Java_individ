package Test_Exception.task05;

import java.util.HashMap;

/* Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
Map<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
            try
            {
                HashMap<String, String> map = new HashMap<String, String>(null);
                map.put(null, null);
                map.remove(null);
            }
            catch (NullPointerException e){
                System.out.println(e);
            }
        //напишите тут ваш код

    }
}
