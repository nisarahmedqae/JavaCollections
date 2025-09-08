package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Batman");
        map.put(2, "Martian Manhunter");
        map.put(3, "Flash");
        map.put(4, "Wonder Woman");
        map.put(5, "Superman");

        // Map keys into List
        List<Integer> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);

        // Map values into List
        List<String> valueList = new ArrayList<>(map.values());
        System.out.println(valueList);

        // Map key-values into List
        List<Map.Entry<Integer, String>> keyValueList = new ArrayList<>(map.entrySet());
        System.out.println(keyValueList);

    }

}
