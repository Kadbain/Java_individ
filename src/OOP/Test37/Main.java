package OOP.Test37;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Ps1X on 05.05.2017.
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
        Map<String , String > ppl = new HashMap<>();
        input(ppl);
        System.out.println(delete(ppl));
    }
    public static void input(Map ppl) {
        ppl.put("Rooney", "Leo");
        ppl.put("Lloris", "Hugo");
        ppl.put("Messi", "Leo");
        ppl.put("Ronaldo", "Cristiano");
        ppl.put("Maldini", "Paolo");
        ppl.put("Indzaghi", "Pipo");
        ppl.put("Del Piero", "Alesandro");
        ppl.put("Balotelli", "Mario");
        ppl.put("Gotze", "Mario");
        ppl.put("Gomez", "Mario");
    }

    public static Map delete(Map<String, String > ppl) {
        Map<String, String > map1 = new HashMap<>();
        for (Map.Entry<String, String > o : ppl.entrySet()) {
            int count = 0;
            for (String o1 : ppl.values()) {
                if (o.getValue().equals(o1)) {
                    count++;
                }
            }
            if (count <= 1) {
                map1.put(o.getKey(), o.getValue());
            }
        }
        return map1;
    }
}
