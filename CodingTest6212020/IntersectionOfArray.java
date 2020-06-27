// write a method to find the intersection of two int arrays?

package CodingTest6212020;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] a = { 8, 7, 3, 9 };
		int[] b = { 1, 2, 8, 3, 7 };
		intersection(a, b);

	}

	public static void intersection(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
