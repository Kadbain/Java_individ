package Test_Exception.task02;
/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
            try
            {
                String s = null;
                String m = s.toLowerCase();
            }
            catch (NullPointerException e){
                String s = e.getMessage();
                System.out.println(e + s);
            }
        //напишите тут ваш код

    }
}
