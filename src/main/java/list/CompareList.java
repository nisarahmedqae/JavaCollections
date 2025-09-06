package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareList {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        List<String> list3 = new ArrayList<String>(Arrays.asList("C", "B", "A"));

        System.out.println(list1.equals(list2)); //true
        System.out.println(list1.equals(list3)); //false
    }
}
