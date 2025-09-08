package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateSubList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 85, 66, 7, 8, 9, 10));

        List<Integer> subList = new ArrayList<>(list.subList(2, 6));
        System.out.println(subList);
    }

}
