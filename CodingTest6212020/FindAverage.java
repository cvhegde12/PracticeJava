//Write a program to find average of consecutive N Odd no. and Even no.

package CodingTest6212020;

public class FindAverage {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		average(a);
	}

	public static void average(int[] a) {
		int oddsum = 0;
		int oddcount = 0;
		int evensum = 0;
		int evencount = 0;
		int oddavg, evenavg;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evensum = evensum + a[i];
				evencount++;
			} else {
				oddsum = oddsum + a[i];
				oddcount++;
			}
		}

		oddavg = oddsum / oddcount;
		evenavg = evensum / evencount;

		System.out.println("Average of odd nos= " + oddavg);
		System.out.println("Average of even nos= " + evenavg);

	}
}
