//1) return indices of the two numbers such that they add up to a specific target in java.
//   ex:-
//  int[] arr = {4, 7, 1, -3, 2};  target = 6, indices = [0, 4]

package CodingTest52020;

public class IndicesOfTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 7, 1, -3, 2 };
		int target = 6;
		System.out.println("The indices of 2 nos whose sum is " + target + ":");
		returnIndices(arr, target);
	}

	public static void returnIndices(int[] a, int target) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] != 1 && b[j] != 1) {
					if (a[i] + a[j] == target) {
						System.out.println(i + "," + j);
						b[i] = 1;
						b[j] = 1;
					}
				}
			}
		}
	}
}
