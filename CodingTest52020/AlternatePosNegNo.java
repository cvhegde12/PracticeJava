//How to rearrange array in alternating positive and negative number. 
//   Input: {1, 2, 3, -4, -1, 4}
//Output: {-4, 1, -1, 2, 3, 4}

// 
//4) sort an array using the Bubble Sort algorithm?
//5) Sum of digits in alphanumeric string in Java
//6) There is an array with every element repeated twice except one. Find that element? 
//7) How find the last repeating element in an array of integers?
//8) find number of occurances of an element in an array for an element
//9) Printing Diamond pattern of numbers java program

package CodingTest52020;

public class AlternatePosNegNo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, -4, -1, 4 }; // {0,1,0,0,0,0}
		alternate(a);
	}

	public static void alternate(int[] a) {
		int[] b = new int[a.length];
		int j = 0;
		int k = 1;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < 0) {
				b[j] = a[i];
				j = j + 2;
			} else if (a[i] > 0) {
				b[k] = a[i];
				k = k + 2;
			}
		}

		for (int x : b) {
			System.out.println(x);
		}
	}
}
