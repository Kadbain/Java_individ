package Test_Exception.task01;
/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        try
        {
            int a = 42 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception has been caught" + e);
        }
        //напишите тут ваш код

    }
}