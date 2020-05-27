//find number of occurances of an element in an array for an element

package CodingTest52020;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 50, 10, 10, 80 };
		int element = 10;
		Occurance(a, element);
	}

	public static void Occurance(int[] a, int element) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i]) + 1);
			} else {
				hm.put(a[i], 1);
			}
		}

		if (hm.containsKey(element)) {
			System.out.println("No of occrances of " + element + " are " + hm.get(element));
		}
	}
}
