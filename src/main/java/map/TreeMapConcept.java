package map;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "Batman");
        map.put(2, "Martian Manhunter");
        map.put(3, "Flash");
        map.put(4, "Wonder Woman");
        map.put(5, "Superman");

        System.out.println(map.firstKey()); //1
        System.out.println(map.lastKey()); //5

        System.out.println("----------valueLessThan3rdKey-------------");
        Collection<String> keysLessThan3 = map.headMap(3).values();
        System.out.println(keysLessThan3); // [Batman, Martian Manhunter]

        System.out.println("-----------keysGreaterEqual3------------");
        Set<Integer> keysGreaterEqual3 = map.tailMap(3).keySet();
        System.out.println(keysGreaterEqual3); // [3, 4, 5]

    }

}
