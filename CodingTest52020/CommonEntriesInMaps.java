
//Find common Entries on two maps
package CodingTest52020;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonEntriesInMaps {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		// entries in map1
		map1.put(1, "Chitra");
		map1.put(2, "Vinay");
		map1.put(3, "Anwesha");
		map1.put(4, "Deetya");

		// entries in map2
		map2.put(1, "Jacob");
		map2.put(2, "Anwesha");
		map2.put(3, "Chitra");
		map2.put(4, "Tom");

		common(map1, map2);
	}

	public static void common(Map<Integer, String> map1, Map<Integer, String> map2) {

		Set<Entry<Integer, String>> e = map1.entrySet();
		for (Entry<Integer, String> x : e) {

			if (map2.containsValue(x.getValue())) {
				System.out.println(x.getValue());

			}
		}
	}
}
