//wap 2 arrays concate the two array and sort the array

package CodingTest6212020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcatArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6 };
		int[] b = { 9, 8, 4, 5 };
		concat(a, b);

	}

	public static void concat(int[] a, int[] b) {
		List<Integer> li = new ArrayList<Integer>();
		for (int x : a) {
			li.add(x);
		}

		for (int x : b) {
			li.add(x);
		}

		Collections.sort(li);
		System.out.println(li.toString());
	}
}
