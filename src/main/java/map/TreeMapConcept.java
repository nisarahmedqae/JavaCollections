package map;

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

        System.out.println("----------keysLessThan3-------------");
        Set<Integer> keysLessThan3 = map.headMap(3).keySet();
        System.out.println(keysLessThan3);

        System.out.println("-----------keysGreaterEqual30------------");
        Set<Integer> keysGreaterEqual3 = map.tailMap(3).keySet();
        System.out.println(keysGreaterEqual3);

    }

}
