package Test_Exception.task03;
/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
try
{
    int[] m = new int[2];
    m[8] = 5;
}
catch(ArrayIndexOutOfBoundsException e){
String s = e.getMessage();
    System.out.println(e + s);
    }
        //напишите тут ваш код

    }
}
