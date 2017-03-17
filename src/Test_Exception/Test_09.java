package Test_Exception;

/**
 * Created by Ps1x on 15.12.2016.
 */
/* Перехватывание исключений
1. Есть три исключения последовательно унаследованные от Exception:
2. class Exception1 extends  Exception
3. class Exception2 extends  Exception1
4. class Exception3 extends  Exception2
5. Есть метод, который описан так:
5.1. public static void method1() throws Exception1, Exception2, Exception3

6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
*/
public class Test_09 {
    public static void main(String[] args) {
        try{
            method1();
        } catch (Exception1 e) {
            e.printStackTrace();
        }
    }
    public static void method1() throws Exception1, Exception2, Exception3 {
        int a = (int) (Math.random() * 3 + 1);
        if (a == 1) {
            throw new Exception1();
        } else if (a == 2) {
            throw new Exception2();
        } else {
            throw new Exception3();
        }
    }
}

class Exception1 extends  Exception {}
class Exception2 extends  Exception1 {}
class Exception3 extends  Exception2 {}
