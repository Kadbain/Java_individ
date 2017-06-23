package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Ps1X on 16.05.2017.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");
*/
public class Main {
    public static void main(String[] args) {
        Map<String , String > names = new HashMap<>();
        fillMap(names);
        System.out.println(deletaPPL(names));

    }
    private static void fillMap (Map<String , String> map) {
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
    }
    private static Map deletaPPL (Map<String , String > map) {
        Map<String, String > delete = new HashMap<>();
        for (Map.Entry<String, String> sSE : map.entrySet()) {
            int count = 0;
            for (String s : map.values()) {
                if (sSE.getValue().equals(s)) {
                    count++;
                }
                }
            if (count == 1) {
                delete.put(sSE.getKey(), sSE.getValue());
            }
        }
        return delete;
    }
}
