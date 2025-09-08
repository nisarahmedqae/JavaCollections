package map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCompare {

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(4, "X");
        map3.put(5, "Y");
        map3.put(6, "Z");

        // 1. comparing key-value pairs
        System.out.println("---------1. comparing key-value pairs-----------");
        System.out.println(map1.equals(map2)); //true
        System.out.println(map1.equals(map3)); //false

        // 2. comparing keys only
        System.out.println("---------2. comparing keys only-----------");
        System.out.println(map1.keySet().equals(map2.keySet())); //true
        System.out.println(map1.keySet().equals(map3.keySet())); //false

        // 3. comparing values only
        System.out.println("---------2. comparing values only-----------");
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values()))); //true
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values()))); //false

    }

}