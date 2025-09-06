package set;

import java.util.HashSet;
import java.util.Set;

public class LoopSet {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Use a for-each loop to iterate over the Set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}