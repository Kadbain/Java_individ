package Test_sobesedovanie.test1;



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

import java.util.*;

public class DeleteFromMapJava8 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        addNewGamer(map);
        System.out.println(deleteEqualsPppl(map));
    }

    public static Map addNewGamer(Map<String, String> map) {
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

    public static Map deleteEqualsPppl(Map<String, String> map) {
        List<String> someKeys = new ArrayList<>();
        for (Map.Entry<String, String> sse : map.entrySet()) {
            int count = 0;
            for (String s : map.values()) {
                if (sse.getValue().equals(s)) {
                    count++;
                }
            }
            if (count > 1) {
                someKeys.add(sse.getKey());
            }

        }
//        while ()
//        for (Map.Entry<String, String> s : map.entrySet()) {
//            for (int i = 0; i < someKeys.size(); i++) {
//                if (s.getKey() == someKeys.get(i)) {
//
//                }
//            }
//        }
        someKeys.forEach(map :: remove);
        return map;
    }
}

