package list;

import java.util.*;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 2, 2, 1));

        Set<Integer> hashSet = new HashSet<>(numbers);
        System.out.println(hashSet); //[1, 2, 3]

    }

}
