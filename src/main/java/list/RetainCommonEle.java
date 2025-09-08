package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RetainCommonEle {

    public static void main(String[] args) {
        // Retain common elements
        List<String> lang1 = new ArrayList<>(Arrays.asList("JAVA", "Python", "C#"));
        List<String> lang2 = new ArrayList<>(Arrays.asList("JAVA", "Python", "JS"));
        lang1.retainAll(lang2);
        System.out.println(lang1); //[JAVA, Python]

        // With Singleton
        List<String> nameList = new ArrayList<>(
                Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Tom"));
        nameList.retainAll(Collections.singleton("Tom"));
        System.out.println(nameList); //[Tom, Tom]
    }
}
