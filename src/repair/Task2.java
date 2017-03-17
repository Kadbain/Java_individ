package repair;

import javafx.util.Pair;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

/**
 * Created by Ps1X on 12.01.2017.
 */
/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Task2 {
    public static void main(String[] args) {
       deleta(zapolnenie());
    }

    public static Map zapolnenie() {
        Map<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
        return map;
    }
    public static void deleta (Map<String , Date> delete1) {
        Iterator<Map.Entry<String , Date>> iterator = delete1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            if (value.getMonth() >= 5 && value.getMonth() < 8) {
                iterator.remove();
            }
        }
        for (Map.Entry<String, Date> stringDateEntry1 : delete1.entrySet()) {
            System.out.println(stringDateEntry1);
        }
    }
}
