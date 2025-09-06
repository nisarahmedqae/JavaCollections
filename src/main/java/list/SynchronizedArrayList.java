package list;

import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		// Thread safe variant of ArrayList
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
		// we dont need explicit synchronization for any operation:
		// add/remove/transverse

		System.out.println(empList);
	}

}
