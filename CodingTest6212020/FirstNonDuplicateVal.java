//Find the first non duplicate value

package CodingTest6212020;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonDuplicateVal {

	public static void main(String[] args) {
		int[] a = { 1, 1, 3, 6, 3, 7, 8, 9, 8 };
		findFirstnonDuplicate(a);

	}

	public static void findFirstnonDuplicate(int[] a) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int x : a) {
			if (!hm.containsKey(x)) {
				hm.put(x, 1);
			} else {
				hm.put(x, hm.get(x) + 1);
			}
		}

		Set<Entry<Integer, Integer>> e = hm.entrySet();
		for (Entry<Integer, Integer> x : e) {
			if (x.getValue() == 1) {
				System.out.println(x.getKey());
				break;
			}
		}
	}

}
