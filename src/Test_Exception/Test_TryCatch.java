package Test_Exception;

/**
 * Created by Ps1X on 28.04.2017.
 */
public class Test_TryCatch {
    public static void main(String[] args) {
        System.out.println(m());
    }

    static int m() {
        try {
            int a = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch");
           // System.exit(0);
            return 5;
        } finally {
            System.out.println("Fin");
        }


        return 0;
    }
}
