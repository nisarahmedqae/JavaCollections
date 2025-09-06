package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableIterate {

    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Batman");
        hashtable.put(2, "Martian Manhunter");
        hashtable.put(3, "Flash");
        hashtable.put(4, "Wonder Woman");
        hashtable.put(5, "Superman");

        hashtable.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("----------------------------------");
        Iterator<Map.Entry<Integer, String>> it = hashtable.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
