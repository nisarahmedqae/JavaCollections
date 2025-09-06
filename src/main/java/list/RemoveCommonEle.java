package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCommonEle {

    public static void main(String[] args) {
        // Retain common elements
        List<String> lang1 = new ArrayList<>(Arrays.asList("JAVA", "Python", "C#"));
        List<String> lang2 = new ArrayList<>(Arrays.asList("JAVA", "Python", "JS"));
        lang1.removeAll(lang2);
        System.out.println(lang1); //[C#]
    }
}
