package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMap {

    public static void main(String[] args) {
        // concurrentHashMap: It does not throw any ConcurrentModificationException
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Batman");
        concurrentMap.put(2, "Martian Manhunter");
        concurrentMap.put(3, "Flash");
        concurrentMap.put(4, "Wonder Woman");
        concurrentMap.put(5, "Superman");

        System.out.println(concurrentMap);
    }

}
