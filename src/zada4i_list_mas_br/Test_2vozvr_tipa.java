package zada4i_list_mas_br;

/**
 * Created by Ps1X on 16.02.2017.
 */
public class Test_2vozvr_tipa {
    public static void main(String[] args) {
        String_Int s_i = vozvr_tip();
        System.out.println(s_i.a + " " + s_i.b);
    }

    private static String_Int vozvr_tip () {
        String name = "Text";
        int age = 5;
        return new String_Int(name, age);
    }

    static class String_Int {
        String a;
        int b;

        public String_Int(String a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
