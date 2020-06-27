//Find the no of occurance of an element in an array

package CodingTest6212020;

public class OccuranceOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 2, 5, 6, 2, 9, 8, 7 };
		int x = 2;
		findOccurance(a, x);
	}

	public static void findOccurance(int[] a, int x) {
		int count = 0;
		int i = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i] == x) {
				count++;
			}
		}
		System.out.println("The no of occurance of digit " + x + " is " + count);
	}
}
