package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods2 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(
                Arrays.asList("Naveen", "Tom", "Naveen", "Steve", "Lisa", "Naveen"));
        int i = list1.lastIndexOf("Naveen");
        System.out.println(i); //5

        list1.remove(1);
        list1.remove("Lisa");

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println(numbers); //[1, 3, 5]

    }

}
