package list;

import java.util.*;

public class LinkedListMethods {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>(Arrays.asList("Tom", "Naveen", "Lisa"));

        names.add(3, "Steve");
        names.add(0, "Ram");

        LinkedList<String> users = new LinkedList<String>();
        users.add("Peter");
        users.add("Trump");

        names.addAll(users);
        names.addFirst("Kamala");
        names.addLast("Shivin");
        names.remove(2);
        names.removeFirst();
        names.removeAll(users);

        System.out.println(names); //[Ram, Naveen, Lisa, Steve, Shivin]

    }

}
