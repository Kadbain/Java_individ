package Test_sobesedovanie.Test3;

/**
 * Created by Ps1X on 07.02.2017.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
            return singleton;
        } else
       return singleton;
   }


}
