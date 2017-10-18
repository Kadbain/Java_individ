package Test_sobesedovanie.test2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ps1X on 09.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Map<String , String > map = new HashMap<>();
        addPpl(map);

        System.out.println(deletePpl(map));
    }
    public static Map addPpl (Map<String , String > map) {
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
        return map;
    }
    public static Map deletePpl (Map <String , String > map) {
        Map<String , String > result = new HashMap<>();
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            int count = 0;
            for (String s : map.values()) {
                if (stringStringEntry.getValue().equals(s)) {
                    count++;
                }
            }
            if (count == 1) {
                result.put(stringStringEntry.getKey(), stringStringEntry.getValue());
            }
        }
        return result;
    }
}
