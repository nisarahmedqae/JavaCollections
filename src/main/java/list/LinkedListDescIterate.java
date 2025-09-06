package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDescIterate {

    public static void main(String[] args) {
        LinkedList<String> lang = new LinkedList<String>();
        lang.add("Java"); // 0
        lang.add("Python"); // 1
        lang.add("Ruby"); // 2
        lang.add("JS");// 3

        // reverse the linkedList:
        Iterator<String> itr = lang.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
