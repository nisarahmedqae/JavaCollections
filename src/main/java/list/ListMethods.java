package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(Arrays.asList("java", "python", "c#"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("js", "typescript", "ruby"));

		list1.addAll(2, list2);
		System.out.println(list1);

		list2.clear();

		System.out.println(list1.contains("python"));
		System.out.println(list1.indexOf("python"));
	}

}
