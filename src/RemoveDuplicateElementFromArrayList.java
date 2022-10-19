import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromArrayList {

	public static void main(String[] args) {

		List<String> name = new ArrayList<>();
		name.add("Viral");
		name.add("Archana");
		name.add("Bhautik");
		name.add("Viral");
		name.add("Archana");
		name.add("Korat");
		name.add("Viral");
		name.add("Archana");
		name.add("Viral");

		Map<String, Integer> n = new HashMap<>();

		for (int i = 0; i < name.size(); i++) {
			int count = Collections.frequency(name, name.get(i));
			if (count > 1) {
				n.put(name.get(i), count);
			}
		}

		Set<String> name1 = new HashSet<String>();
		Set<String> name2 = new HashSet<String>();

		for (int i = 0; i < name.size(); i++) {
			if (name1.add(name.get(i)) == false) {
				name2.add(name.get(i));
			}
		}

		System.out.println("The Array Element Before Sorting: " + name);
		System.out.println();

		Collections.sort(name);
		System.out.println("The Array Element Aefore Sorting: " + name);
		System.out.println();

		System.out.println("Array List After Removing Duplicate Name: " + name1);
		System.out.println();

		System.out.println("The Duplicate Name in Array list: " + name2);
		System.out.println();

		System.out.println("Occurance of Duplicate Name:" + n);
	}
}

// option 2 for sorting
/*
 * List<String> nameX = name.stream().distinct().collect(Collectors.toList());
 * System.out.println(name1);
 */
