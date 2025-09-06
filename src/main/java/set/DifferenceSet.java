package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferenceSet {

    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> secondSet = new HashSet<Integer>();
        secondSet.addAll(Arrays.asList(5, 6, 7, 8, 9));

        // removing secondSet from firstSet
        firstSet.removeAll(secondSet);
        System.out.println(firstSet); // [1, 2, 3, 4]
    }
}
