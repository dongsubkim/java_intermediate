package Part_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "john");
        map.put("002", "smith");
        map.put("003", "david");

        map.put("001", "kevin");

        System.out.println(map.size());

        System.out.println(map.get("001"));
        System.out.println(map.get("002"));

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
