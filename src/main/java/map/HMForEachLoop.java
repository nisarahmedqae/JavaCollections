package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMForEachLoop {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Batman");
        map.put(2, "Martian Manhunter");
        map.put(3, "Flash");
        map.put(4, "Wonder Woman");
        map.put(5, "Superman");

        Set<Map.Entry<Integer, String>> entryForEach = map.entrySet();
        for (Map.Entry<Integer, String> entry : entryForEach) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }

}
