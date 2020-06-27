// Print highest prime number from a given range

package CodingTest6212020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestPrime {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 9, 11, 23, 7 };
		highestPrime(a);
	}

	public static void highestPrime(int[] a) {
		boolean isPrime = true;

		List<Integer> li = new ArrayList<Integer>();

		for (int i = 1; i < a.length; i++) {
			if (a[i] == 1) {
				isPrime = false;
			} else {
				for (int j = 2; j < a.length / 2; j++) {
					if (a[i] % j == 0) {
						isPrime = false;
						break;
					} else {
						li.add(a[i]);
					}
				}
			}
		}

		Collections.sort(li);
		Collections.reverse(li);
		System.out.println(li);
		System.out.println("The highest prime no of the given range is: " + li.get(0));
	}
}
