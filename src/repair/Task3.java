package repair;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 12.01.2017.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Task3 {
    public static void main(String[] args) {
       Map<String, String> map = deletaName(getMap());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
    public static Map getMap () {
        Map<String , String > imena = new HashMap<>();
        imena.put("Rooney", "Leo");
        imena.put("Lloris", "Hugo");
        imena.put("Messi", "Leo");
        imena.put("Ronaldo", "Cristiano");
        imena.put("Maldini", "Paolo");
        imena.put("Indzaghi", "Pipo");
        imena.put("Del Piero", "Alesandro");
        imena.put("Balotelli", "Mario");
        imena.put("Gotze", "Mario");
        imena.put("Gomez", "Mario");
        return imena;
    }
    public static Map deletaName (Map<String , String > imena1) {
        Map<String , String > imenaZamena = new HashMap<>();

        for (Map.Entry<String , String > s : imena1.entrySet()) {
            int count = 0;
            for (String s1 : imena1.values()) {

                if (s1.equals(s.getValue())) {
                    count++;
                }

            }
            if (count == 1) {
                imenaZamena.put(s.getKey(), s.getValue());
            }
        }

       return imenaZamena;
    }
}
