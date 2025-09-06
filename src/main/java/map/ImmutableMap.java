package map;

import java.util.Collections;
import java.util.Map;

public class ImmutableMap {

    public static void main(String[] args) {

        // Immutable with only single entry
        Map<String, Integer> immutableMap = Collections.singletonMap("test", 200);
        System.out.println(immutableMap.get("test"));

        immutableMap.put("entry", 300); //UnsupportedOperationException

    }

}
