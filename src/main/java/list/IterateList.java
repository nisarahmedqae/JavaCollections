package list;

import java.util.*;

public class IterateList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get an Iterator for the List
        Iterator<Integer> iterator = numbers.iterator();

        // Loop using hasNext() and next()
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

    }
}