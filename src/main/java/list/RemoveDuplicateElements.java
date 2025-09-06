package list;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 2, 1));

        Set<Integer> hashSet = new HashSet<Integer>(numbers);
        System.out.println(hashSet); //[1, 2, 3]

    }

}
