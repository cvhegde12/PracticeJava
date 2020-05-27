//sort an array using the Bubble Sort algorithm?

package CodingTest52020;

public class SortArrayUsingBubbleSort {
	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 31, 21, 51, 41, 11 };
		int temp = 0;

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// compare element that we are current looking at to other elements in array
				if (arr[i] > arr[j]) {
					// element we are looking at is bigger than other element so we need to swap
					// them
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
