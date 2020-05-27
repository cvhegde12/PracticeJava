// There is an array with every element repeated twice except one. Find that element?

package CodingTest52020;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatedNo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 3, 1, 3, 2 };
		NonRepeatedNo(a);
	}

	public static void NonRepeatedNo(int[] a) {

		int i = 0;
		int j = 0;
		int[] b = new int[a.length];
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (b[i] != 1 && b[j] != 1) {
					if (a[i] == a[j]) {
						b[i] = 1;
						b[j] = 1;
					}
				}
			}

		}
		for (i = 0; i < a.length; i++) {
			if (b[i] != 1)
				System.out.println(a[i]);
		}
	}

	// method 2
	public static int noRepeating(int arr[]) {

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			} else {
				m.put(arr[i], 1);
			}
		}

		for (int i = 0; i < arr.length; i++)
			if (m.get(arr[i]) == 1)
				return arr[i];
		return -1;
	}
}
