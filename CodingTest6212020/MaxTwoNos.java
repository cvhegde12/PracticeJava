//Write a program to find the top two maximum numbers in an array.

package CodingTest6212020;

public class MaxTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 5, 6, 1, 8, 5 };
		maxTwo(a);
	}

	public static void maxTwo(int[] a) {
		int maxone = 0;
		int maxtwo = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxone) {
				maxtwo = maxone;
				maxone = a[i];
			}
		}
		System.out.println(maxone + "," + maxtwo);
	}
}
