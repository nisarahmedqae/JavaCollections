package list;

import java.util.ArrayList;
import java.util.List;

public class LoopList {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Use a for-each loop to iterate over the List
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("--------------------------------");

        // Use a for loop to iterate over the List
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

    }

}