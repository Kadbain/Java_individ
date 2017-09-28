package Test_sobesedovanie.Nod;

/**
 * Created by Ps1X on 12.05.2017.
 */
public class NOD {
    public static void main(String[] args) {
        System.out.println(nod(15, 8));
    }
    public static int nod (int i1, int i2) {
        if (i1 == 0 || i2 == 0) {
            return 0;
        }
        if (i1>=i2) {
            while (i2 != 0) {
                int temp = i1 % i2;
                i1 = i2;
                i2 = temp;
            }
            return i1;
        } else {
            while (i1 != 0){
                int temp = i2 % i1;
                i2 = i1;
                i1 = temp;
            }
            return i2;
        }
    }
}



