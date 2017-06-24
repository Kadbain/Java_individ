package Test_sobesedovanie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 24.06.2017.
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
public class Main1 {

    public static void main(String[] args) {
        HashMap<String , String > ppl = new HashMap<>();
        addPpl(ppl);
        ppl = (HashMap<String, String>) deletePpl(ppl);
        for (String s : ppl.keySet()) {
            System.out.println(s);
        }

    }
    private static void addPpl (Map<String , String > map) {
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
    private static Map deletePpl (Map<String , String > map) {
        HashMap <String , String > ppl1 = new HashMap<>();
        for (Map.Entry<String, String> sse : map.entrySet()) {
            int count = 0;
            for (String s : map.values()) {
                if (sse.getValue().equals(s)) {
                    count++;
                }
            }
            if (count == 1) {
                ppl1.put(sse.getKey(), sse.getValue());
            }
        }
        return ppl1;
    }
    private static void buble () {

    }
}