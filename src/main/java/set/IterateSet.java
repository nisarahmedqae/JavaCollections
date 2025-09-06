package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get an Iterator for the Set
        Iterator<Integer> iterator = numbers.iterator();

        // Loop using hasNext() and next()
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

    }
}