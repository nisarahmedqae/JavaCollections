package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionSet {

    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> secondSet = new HashSet<>();
        secondSet.addAll(Arrays.asList(5, 6, 7, 8, 9));

        // combining two set
        firstSet.addAll(secondSet);
        System.out.println(firstSet); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
